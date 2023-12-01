package org.appxi.cbeta;

import org.appxi.prefs.UserPrefs;
import org.appxi.util.DigestHelper;
import org.appxi.util.FileHelper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BooksTree {
    protected static final Object AK_ELEMENT = new Object();
    public final BookMap bookMap;
    protected final String navType;

    protected Element navElement;

    public BooksTree(BookMap bookMap, String navType) {
        this.bookMap = bookMap;
        this.navType = navType;
    }

    public Element getNavElement() {
        if (null != navElement) {
            return this.navElement;
        }
        final String navFileOrig = navType + "_nav.xhtml";
        final long navFileOrigTime = bookMap.bookcase.getLastModifiedTime(navFileOrig);
        final Path navFileTemp = UserPrefs.cacheDir().resolve(navFileOrig);
        final long navFileTempTime = FileHelper.fileTime(navFileTemp);


        try (InputStream stream = this.bookMap.bookcase.getContentAsStream(navType + "_nav.xhtml")) {
            this.navElement = Jsoup.parse(stream, StandardCharsets.UTF_8.name(), "/", Parser.xmlParser())
                    .body()
                    .selectFirst("nav");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return this.navElement;
    }

    public List<Book> getChildren() {
        return this.getChildren(null);
    }

    public List<Book> getChildren(Book parent) {
        Elements elements;
        if (null == parent) {
            elements = this.getNavElement().select(":root, :root > li");
        } else {
            Element parentEle = parent.attr(AK_ELEMENT);
            if (null == parentEle) {
                return List.of();
            }
            if (parentEle.attributes().hasKey("href")) {
                return List.of();
            } else {
                elements = parentEle.select("> ol > li");
            }
        }
        //
        final List<Book> result = new ArrayList<>(elements.size());
        for (Element element : elements) {
            final Element span = element.selectFirst("> span");
            if (null != span) {
                result.add(toBook(span));
                continue;
            }
            final Element link = element.selectFirst("> [href]");
            if (null != link) {
                result.add(toBook(link));
            }
        }
        return result;
    }

    public Book toBook(Element element) {
        if (element.getUserData() instanceof Book book) {
            return book;
        }
        final String link = element.attr("href");

        Book book;
        if (link.isEmpty()) {
            book = bookMap.ofBook();
            book.title = element.attr("t");
            if (book.title.isEmpty()) {
                book.title = BookHelper.parseNavCatalogInfo(element.text());
            }
        } else if (link.startsWith("toc/")) {
            book = bookMap.data().get(element.attr("i"));
        } else if (link.startsWith("XML/")) {
            final String text = element.text();
            final String[] tmpArr = text.split("[ 　]", 2);
            book = bookMap.data().get(tmpArr[0]);
            if (null == book && tmpArr[0].matches(".*[a-z]$")) {
                book = bookMap.data().get(tmpArr[0].substring(0, tmpArr[0].length() - 1));
                if (null != book) {
                    book.attr("cloned", true);
                    book = book.clone();
                    book.title = text;
                    book.attr("start", link);
                }
            }
        } else {
            book = bookMap.ofBook();
            book.id = element.attrOr("i", () -> DigestHelper.crc32c(link));
            book.title = element.text();
            book.path = link;
            bookMap.data().put(book.id, book);
        }
        //
        if (book != null) {
            book.attr(AK_ELEMENT, element);
            element.setUserData(book);
        }
        return book;
    }
}
