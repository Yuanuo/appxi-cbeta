package appxi.cbeta;

import org.appxi.holder.BoolHolder;
import org.appxi.util.DigestHelper;
import org.appxi.util.NumberHelper;
import org.appxi.util.StringHelper;
import org.appxi.util.ext.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class ChapterTreeParser<T> {
    public final Bookcase bookcase;
    public final Book book;
    private final T volChapters, tocChapters;
    private final Object markParsedKey;

    protected ChapterTreeParser(Bookcase bookcase, Book book, T tocChapters, T volChapters, Object markParsedKey) {
        this.bookcase = bookcase;
        this.book = book;
        this.volChapters = volChapters;
        this.tocChapters = tocChapters;
        this.markParsedKey = markParsedKey;
    }

    public final T getVolChapters() {
        ensureBookChaptersParsed();
        return volChapters;
    }

    public final T getTocChapters() {
        ensureBookChaptersParsed();
        return tocChapters;
    }

    private boolean onceParsed = false;

    private void ensureBookChaptersParsed() {
        if (onceParsed || null != markParsedKey && book.hasAttr(markParsedKey))
            return;
        if (StringHelper.isBlank(book.path)) {
            // do nothing
        } else if (book.path.startsWith("toc/")) {
//            System.out.println("init chapters: " + book.path);
            Document doc = this.bookcase.getContentAsDocument(book.path);
            Element body = doc.body();

            //
            Element navCatalog = body.selectFirst("> nav[type=catalog]");
            Set<String> ctxVolumes = new LinkedHashSet<>();
            if (null != navCatalog) {
                initTocChapterAndChildren(book, tocChapters, navCatalog.selectFirst("> ol"), ctxVolumes);
            }
            //
            Element navJuan = body.selectFirst("> nav[type=juan]");
            if (null != navJuan) {
                navJuan.select("li > [href]").forEach(link -> ctxVolumes.add(link.attr("href").split("#", 2)[0]));
            }
            final Attributes ctx = new Attributes();
            ctxVolumes.stream().sorted().forEach(vol -> initVolChapterAndFixSequence(book, volChapters, vol, ctx));
            fixVolChapters();
        } else {
            createTreeItem(tocChapters, createChapter().setId(StringHelper.concat(book.id, "-1")).setType("article").setTitle(book.title).setPath(book.path));
        }
        onceParsed = true;
        if (null != markParsedKey)
            book.attr(markParsedKey, true);
    }

    private void initVolChapterAndFixSequence(Book book, T parent, String linkHref, Attributes ctx) {
        String linkPath = linkHref.split("#", 2)[0];
        String[] nameInfo = linkPath.substring(linkPath.lastIndexOf("/") + 1, linkPath.lastIndexOf(".")).split("[n_]");

        String currSerial = nameInfo[0];
        int currIdx = Integer.parseInt(nameInfo[2]);

        String prevSerial = ctx.attrStr("prevSerial");
        int prevIdx = ctx.hasAttr("prevIdx") ? ctx.attr("prevIdx") : -1;

        //
        int fixFrom = -1;
        if (null == prevSerial && currIdx > 1) {
            // start not from _001.xml, need fix
            fixFrom = 1;
        } else if (prevIdx != -1 && currIdx - prevIdx > 1) {
            // between curr and prev more than 1, need fix
            fixFrom = prevIdx + 1;
        }
        // need fix
        if (fixFrom > -1) {
            String tmpLink = linkPath.substring(0, linkPath.lastIndexOf("_") + 1);
            String tmpIdx;
            for (int i = fixFrom; i < currIdx; i++) {
                tmpIdx = StringHelper.concat(i < 10 ? "00" : (i < 100 ? "0" : null), i);
                createTreeItem(parent, createChapter("title",
                        StringHelper.concat(nameInfo[0], "n", nameInfo[1], "_", tmpIdx),
                        StringHelper.concat("卷", NumberHelper.toChineseNumberOld(i)),
                        StringHelper.concat(tmpLink, tmpIdx, ".xml"),
                        null));
            }
        }
        // normal
        createTreeItem(parent, createChapter("article",
                StringHelper.concat(nameInfo[0], "n", nameInfo[1], "_", nameInfo[2]),
                StringHelper.concat("卷", NumberHelper.toChineseNumberOld(currIdx)),
                linkPath,
                null));

        // keep curr as prev for next
        ctx.attr("prevSerial", currSerial);
        ctx.attr("prevIdx", currIdx);
    }

    protected Chapter createChapter() {
        return new Chapter();
    }

    private Chapter createChapter(String type, String id, String title, String path, String start) {
        Chapter chapter = createChapter();
        chapter.type = type;
        chapter.id = id;
        chapter.title = title;
        chapter.path = path;
        chapter.anchor = null != start ? "#".concat(start) : null;
        return chapter;
    }

    private void initTocChapterAndChildren(Book book, T parent, Element element, Set<String> ctxVolumes) {
        Elements lis = element.select("> li");
        Element linkEle;
        String linkHref, linkText;
        String[] linkInfo;
        T child;
        Chapter childVal;
        for (Element liEle : lis) {
            linkEle = liEle.selectFirst("> [href]");
            linkHref = linkEle.attr("href");
            linkInfo = linkHref.split("#", 2);
            linkText = linkEle.text();

            ctxVolumes.add(linkInfo[0]);

            childVal = createChapter("article",
                    book.id.concat("_").concat(DigestHelper.crc32c(linkHref, linkText)),
                    linkText,
                    linkInfo[0],
                    linkInfo.length == 2 ? linkInfo[1] : null);
            child = createTreeItem(parent, childVal);

            linkEle = liEle.selectFirst("> ol");
            if (null != linkEle) {
                initTocChapterAndChildren(book, child, linkEle, ctxVolumes);
                childVal.type = "title";
            }
        }
    }

    protected abstract T createTreeItem(T parent, Chapter chapter);

    private void fixVolChapters() {
        // start fix vols in chapters
        final BoolHolder holdChanged = new BoolHolder(false);
        book.volumes.forEach((volIdx, volSerial) -> {
            String baseVolId = StringHelper.concat(book.tripitakaId, volSerial, "n", book.number, "_");
            String baseVolPath = StringHelper.concat("XML/", book.tripitakaId, "/", book.tripitakaId, volSerial, "/");

            //
            String volId = StringHelper.concat(baseVolId, volIdx < 10 ? "00" : (volIdx < 100 ? "0" : null), volIdx);
            String volPath = StringHelper.concat(baseVolPath, volId, ".xml");

            // check exists in volChapters
            if (!existsItemInTree(volPath, volChapters)) {
                holdChanged.value = true;
                createTreeItem(volChapters, createChapter("title", volId,
                        StringHelper.concat("卷", NumberHelper.toChineseNumberOld(volIdx)),
                        volPath, null));
            }
        });
        if (holdChanged.value) {
            sortChildrenOfTree(volChapters);
        }
        // end fix
    }

    protected abstract boolean existsItemInTree(String path, T tree);

    protected abstract void sortChildrenOfTree(T tree);
}
