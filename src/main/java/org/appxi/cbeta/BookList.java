package org.appxi.cbeta;

import org.appxi.holder.BoolHolder;
import org.appxi.util.DigestHelper;
import org.appxi.util.ext.HanLang;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class BookList<T> {
    protected final BookMap bookMap;
    protected final T data;
    private final InputStream closableInputStream;

    private HanLang hanLang = HanLang.hantTW;

    public BookList(BookMap bookMap, T data, InputStream closableInputStream) {
        this.bookMap = bookMap;
        this.data = data;
        this.closableInputStream = Objects.requireNonNull(closableInputStream);
    }

    public final HanLang getHanLang() {
        return hanLang;
    }

    private final BoolHolder dataInit = new BoolHolder();

    public T tree() {
        if (dataInit.value)
            return this.data;
        synchronized (dataInit) {
            if (dataInit.value)
                return this.data;
            try (InputStream stream = this.closableInputStream) {
                final Document doc = Jsoup.parse(stream, StandardCharsets.UTF_8.name(), "/", Parser.xmlParser());
                final Element nav = doc.body().selectFirst("nav");
                if (null != nav) {
                    this.hanLang = HanLang.valueBy(nav.attrOr("han-lang", "zh-tw"));
                    walkAndParseTreeItems(data, nav.select(":root, :root > li"));
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                System.gc();
            }
            //
            dataInit.value = true;
        }
        return this.data;
    }

    private void walkAndParseTreeItems(T parent, Elements elements) {
        final List<T> children = new ArrayList<>(elements.size());
        for (Element ele : elements) {
            final T treeItem = walkAndParseTreeItem(ele);
            if (null != treeItem)
                children.add(treeItem);
        }
        relinkChildren(parent, children);
    }

    private T walkAndParseTreeItem(Element li) {
        if (null == li)
            return null;
        final Element span = li.selectFirst("> span");
        if (null != span) {
            final T treeItem = parseTreeItem(span);
            if (null != treeItem)
                walkAndParseTreeItems(treeItem, li.selectFirst("> ol").select("> li"));
            return treeItem;
        }

        final Element linkEle = li.selectFirst("> [href]");
        if (null == linkEle)
            return null;
        return parseTreeItem(linkEle);
    }

    private T parseTreeItem(Element item) {
        if (!acceptDataItem(item)) return null;
        final String link = item.attr("href");

        Book book;
        if (link.isEmpty()) {
            book = bookMap.ofBook();
            book.id = item.attrOr("i", () -> null);
            book.title = item.attrOr("t", () -> BookHelper.parseNavCatalogInfo(item.text()));
        } else if (link.startsWith("toc/")) {
            book = bookMap.data().get(item.attr("i"));
        } else if (link.startsWith("XML/")) {
            final String text = item.text();
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
        } else if (link.startsWith("a/")) {
            book = bookMap.ofBook();
            book.id = item.attrOr("i", () -> {
                String fileVend = link.substring(2, link.indexOf('/', 2));
                String fileName = link.substring(link.lastIndexOf('/') + 1);
                if (fileName.startsWith(fileVend)) {
                    return fileName.substring(0, fileName.lastIndexOf('.'));
                }
                return DigestHelper.crc32c(link);
            });
            book.title = item.text();
            book.path = link;
            book.authorInfo = item.attr("a");
            book.library = link.substring(2, link.indexOf('/', 2));
            bookMap.data().put(book.id, book);
            //
            if (!book.authorInfo.isBlank()) {
                Collections.addAll(book.authors, book.authorInfo.split(","));
            }
            String str = item.attr("p");
            if (!str.isBlank()) {
                Collections.addAll(book.periods, str.split(","));
            }
        } else if (link.startsWith("help/other/")) {
            book = bookMap.ofBook();
            final String linkText = item.text();
            book.id = item.attrOr("i", () -> DigestHelper.crc32c(link + linkText));
            book.title = linkText;
            book.path = link;
            //
            book.library = link.substring(11, link.indexOf('/', 11));
            if (book.library.length() > 2) {
                book.library = link.substring(link.lastIndexOf('/') + 1).replaceAll("(\\d|-).*", "").toUpperCase();
            }
            bookMap.data().put(book.id, book);
        } else {
            book = bookMap.ofBook();
            final String linkText = item.text();
            book.id = item.attrOr("i", () -> DigestHelper.crc32c(link + linkText));
            book.title = linkText;
            book.path = link;
            bookMap.data().put(book.id, book);
        }
        if (null == book) return null;
        return this.createTreeItem(item, book);
    }

    protected boolean acceptDataItem(Element item) {
        return true;
    }

    protected abstract T createTreeItem(Element item, Book itemValue);

    protected abstract void relinkChildren(T parent, List<T> children);
}
