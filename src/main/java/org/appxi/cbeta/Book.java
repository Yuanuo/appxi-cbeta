package org.appxi.cbeta;

import org.appxi.util.ext.Attributes;
import org.appxi.util.ext.Node;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Book extends Attributes implements Serializable {
    public String id, title, path, tripitakaId, number;
    public final Map<Short, String> volumes = new HashMap<>();

    public final Node<Chapter> chapters = new Node<>();
    //
    public String authorInfo;
    public final Collection<String> periods = new HashSet<>();
    public final Collection<String> authors = new HashSet<>();
    //
    public String catalog, location;

    public Book setId(String id) {
        this.id = id;
        return this;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    private static final Object AK_AUTHORS = new Object();

    public String authorInfo() {
        if (!this.hasAttr(AK_AUTHORS)) {
            BookHelper.parseBookAuthorInfo(this);
            this.attr(AK_AUTHORS, true);
        }
        return this.authorInfo;
    }

    @Override
    public String toString() {
        return this.title;
    }

    protected Book clone() {
        Book book = new Book();
        this.copyTo(book);
        return book;
    }

    protected void copyTo(Book book) {
        book.id = this.id;
        book.title = this.title;
        book.authorInfo = this.authorInfo;
        book.catalog = this.catalog;
        book.location = this.location;
        book.path = this.path;
        book.tripitakaId = this.tripitakaId;
        book.number = this.number;
        book.volumes.putAll(this.volumes);
    }
}
