package org.appxi.cbeta;

import org.appxi.util.DigestHelper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BooksNav {
    private static final Object AK_ELEMENT = new Object();
    public final BooksMap booksMap;
    public final String navType;
    private Element navElement;

    public BooksNav(BooksMap booksMap, String navType) {
        this.booksMap = booksMap;
        this.navType = navType;
    }

    public final Element getNavElement() {
        if (null == navElement) {
            try (InputStream stream = this.booksMap.bookcase.getContentAsStream(navType + "_nav.xhtml")) {
                this.navElement = Jsoup.parse(stream, StandardCharsets.UTF_8.name(), "/", Parser.xmlParser())
                        .body()
                        .selectFirst("nav");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return this.navElement;
    }

    public final List<Book> getChildren() {
        return this.getChildren(null);
    }

    public final List<Book> getChildren(Book parent) {
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

    public void list(Consumer<Element> consumer) {
        this.list(null, consumer);
    }

    public void list(Element parent, Consumer<Element> consumer) {
        Elements elements;
        if (null == parent) {
            elements = this.getNavElement().select(":root, :root > li");
        } else if (parent.attributes().hasKey("href")) {
            return;
        } else {
            elements = parent.select("> ol > li");
        }
        //
        for (Element element : elements) {
            final Element span = element.selectFirst("> span");
            if (null != span) {
                consumer.accept(span);
                continue;
            }
            final Element link = element.selectFirst("> [href]");
            if (null != link) {
                consumer.accept(link);
            }
        }
    }

    public Book toBook(Element element) {
        if (element.getUserData() instanceof Book book) {
            return book;
        }
        final String link = element.attr("href");

        Book book;
        if (link.isEmpty()) {
            book = booksMap.ofBook();
            book.title = element.attr("t");
            if (book.title.isEmpty()) {
                book.title = BookHelper.parseNavCatalogInfo(element.text());
            }
        } else if (link.startsWith("toc/")) {
            book = booksMap.data().get(element.attr("i"));
        } else if (link.startsWith("XML/")) {
            final String text = element.text();
            final String[] tmpArr = text.split("[ 　]", 2);
            book = booksMap.data().get(tmpArr[0]);
            if (null == book && tmpArr[0].matches(".*[a-z]$")) {
                book = booksMap.data().get(tmpArr[0].substring(0, tmpArr[0].length() - 1));
                if (null != book) {
                    book.attr("cloned", true);
                    book = book.clone();
                    book.title = text;
                    book.attr("start", link);
                }
            }
        } else {
            book = booksMap.ofBook();
            book.id = element.attrOr("i", () -> DigestHelper.crc32c(link));
            book.title = element.text();
            book.path = link;
            booksMap.data().put(book.id, book);
        }
        //
        if (book != null) {
            book.attr(AK_ELEMENT, element);
            element.setUserData(book);
        }
        return book;
    }

    public void walk(Consumer<Element> consumer) {
        walk(null, consumer);
    }

    public void walk(Element parent, Consumer<Element> consumer) {
        Elements elements;
        if (null == parent) {
            elements = this.getNavElement().select(":root, :root > li");
        } else if (parent.attributes().hasKey("href")) {
            return;
        } else {
            elements = parent.select("> ol > li");
        }
        //
        for (Element element : elements) {
            final Element span = element.selectFirst("> span");
            if (null != span) {
                consumer.accept(span);
                //
                walk(element, consumer);
                //
                continue;
            }
            final Element link = element.selectFirst("> [href]");
            if (null != link) {
                consumer.accept(link);
            }
        }
    }
}
