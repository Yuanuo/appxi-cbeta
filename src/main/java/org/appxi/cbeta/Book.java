package org.appxi.cbeta;

import org.appxi.util.StringHelper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Book extends org.appxi.book.Book {
    public String number;
    public final Map<Short, String> volumes = new LinkedHashMap<>();
    //
    private static final Object AK_AUTHORS = new Object();

    public String authorInfo() {
        if (!this.hasAttr(AK_AUTHORS)) {
            BookHelper.parseBookAuthorInfo(this);
            if (StringHelper.isBlank(this.authorInfo)) {
                this.authorInfo = String.join(", ", this.authors);
            }
            this.attr(AK_AUTHORS, true);
        }
        return this.authorInfo;
    }

    @Override
    public Book clone() {
        return (Book) super.clone();
    }

    @Override
    public void copyTo(org.appxi.book.Book book) {
        super.copyTo(book);
        if (book instanceof Book bookEx) {
            bookEx.number = this.number;
            bookEx.volumes.putAll(this.volumes);
        }
    }

    @Override
    public Book ofBook() {
        return new Book();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(path, book.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, path);
    }

}
