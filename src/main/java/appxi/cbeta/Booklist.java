package appxi.cbeta;

import org.appxi.util.DigestHelper;
import org.appxi.util.ext.Attributes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public abstract class Booklist<T> extends Attributes {
    protected final BookMap books;
    protected final T data;
    private final InputStream inputStream;

    public Booklist(BookMap books, T data, InputStream inputStream) {
        this.books = books;
        this.data = data;
        this.inputStream = inputStream;
        if (null == this.inputStream)
            throw new RuntimeException();
    }

    private final Object dataInit = new Object();

    public T getDataTree() {
        if (this.hasAttr(dataInit))
            return this.data;
        synchronized (dataInit) {
            if (this.hasAttr(dataInit))
                return this.data;
            this.attr(dataInit, true);
            //
            try (InputStream stream = this.inputStream) {
                final Document doc = Jsoup.parse(stream, StandardCharsets.UTF_8.name(), "/", Parser.xmlParser());
                final Element nav = doc.body().selectFirst("nav");
                if (null != nav)
                    walkAndParseTreeItems(data, nav.select(":root, :root > li"));
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                System.gc();
            }
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

        final Element linkEle = li.selectFirst("[href]");
        if (null == linkEle)
            return null;
        return parseTreeItem(linkEle);
    }

    private T parseTreeItem(Element item) {
        final String link = item.attr("href");

        Book book;
        if (link.isEmpty()) {
            book = new Book();
            book.title = item.attrOr("t", () -> BookHelper.parseNavCatalogInfo(item.text()));
        } else if (link.startsWith("XML/")) {
            final String text = item.text();
            final String[] tmpArr = text.split("[ 　]", 2);
            book = books.getDataMap().get(tmpArr[0]);
            if (null == book && tmpArr[0].matches(".*[a-z]$")) {
                book = books.getDataMap().get(tmpArr[0].substring(0, tmpArr[0].length() - 1));
                if (null != book) {
                    book.attr("cloned", true);
                    book = book.clone();
                    book.title = text;
                    book.attr("start", link);
                }
            }
        } else {
            book = new Book();
            book.id = item.attrOr("i", () -> DigestHelper.crc32c(link));
            book.title = item.text();
            book.path = link;
            books.getDataMap().put(book.id, book);
        }
        if (null == book) return null;
        // set visible
        book.attr("v", !item.attrIs("v", "0"));
        return this.createTreeItem(book);
    }

    protected abstract T createTreeItem(Book itemValue);

    protected abstract void relinkChildren(T parent, List<T> children);
}
