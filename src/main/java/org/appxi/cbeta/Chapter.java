package org.appxi.cbeta;

import org.appxi.util.ext.Attributes;

import java.io.Serializable;

public class Chapter extends Attributes implements Serializable {
    public String type, id, title, path, anchor;

    public Chapter() {
    }

    public Chapter(String type, String id, String title, String path, String anchor) {
        this.type = type;
        this.id = id;
        this.title = title;
        this.path = path;
        this.anchor = anchor;
    }

    public Chapter setType(String type) {
        this.type = type;
        return this;
    }

    public Chapter setId(String id) {
        this.id = id;
        return this;
    }

    public Chapter setTitle(String title) {
        this.title = title;
        return this;
    }

    public Chapter setPath(String path) {
        this.path = path;
        return this;
    }

    @Override
    public String toString() {
        return title;
    }
}
