package org.appxi.cbeta;

import org.appxi.util.FileHelper;
import org.appxi.util.StringHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookMap {
    private static final Pattern VOL_REGEX = Pattern.compile("(.*)(\\(第)(\\d+)(卷-第)(\\d+)(卷.*)");
    public final Bookcase bookcase;
    public final TripitakaMap tripitakaMap;
    private Map<String, Book> data;

    public BookMap(TripitakaMap tripitakaMap) {
        this.bookcase = tripitakaMap.bookcase;
        this.tripitakaMap = tripitakaMap;
    }

    public boolean isEmpty() {
        return null == this.data || this.data.isEmpty();
    }

    private final Object dataInit = new Object();

    public Map<String, Book> data() {
        if (null != this.data)
            return this.data;
        synchronized (dataInit) {
            if (null != this.data)
                return this.data;
            this.data = new HashMap<>(5120);
            try {
                FileHelper.lines(this.bookcase.getContentAsStream("catalog.txt"), this::parse);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.gc();
            }
        }
        return this.data;
    }

    private void parse(final String line) {
        final String[] arr = line.split(", ", 8);
        final String tripitakaId = arr[0].strip();
        String catalog = arr[1].strip();
        final String group = arr[2].strip();
        if (!group.isBlank())
            catalog = StringHelper.concat(catalog, "/", group);
        final String serial = arr[3].strip();
        final String number = arr[4].strip();
        final short volsNum = Short.parseShort(arr[5].strip());
        String name = arr[6].strip();
        final String author = arr[7].strip();

        // detect vol num from name
        final Matcher matcher = VOL_REGEX.matcher(name);
        short startVolNum = 1, endVolNum = volsNum;
        if (matcher.matches()) {
            name = matcher.group(1);
            startVolNum = Short.parseShort(matcher.group(3));
            endVolNum = Short.parseShort(matcher.group(5));
        }

        //
        final String bookId = StringHelper.concat(tripitakaId, number);
        Book book = data.get(bookId);
        if (null == book) {
            data.put(bookId, book = new Book());
            book.id = bookId;
            book.title = name;
            book.authorInfo = author;
            book.catalog = catalog;
            Tripitaka tripitaka = tripitakaMap.data().get(tripitakaId);
            if (null == tripitaka)
                book.location = StringHelper.concat(catalog, "/", name);
            else book.location = StringHelper.concat(tripitaka.name, "/", catalog, "/", name);
            book.path = StringHelper.concat("toc/", tripitakaId, "/", bookId, ".xml");
            book.tripitakaId = tripitakaId;
            book.number = number;
            startVolNum = 1;
        }
        for (short i = startVolNum; i <= endVolNum; i++) book.volumes.put(i, serial);
    }
}
