package org.appxi.cbeta;

import java.util.HashMap;
import java.util.Map;

public class Book extends org.appxi.book.Book {
    public String number;
    public final Map<Short, String> volumes = new HashMap<>();
    //
    private static final Object AK_AUTHORS = new Object();

    public String authorInfo() {
        if (!this.hasAttr(AK_AUTHORS)) {
            BookHelper.parseBookAuthorInfo(this);
            this.attr(AK_AUTHORS, true);
        }
        return this.authorInfo;
    }

    @Override
    public Book clone() {
        return (Book) super.clone();
    }

    public void copyTo(Book book) {
        super.copyTo(book);
        book.number = this.number;
        book.volumes.putAll(this.volumes);
    }

    @Override
    public Book ofBook() {
        return new Book();
    }
}
