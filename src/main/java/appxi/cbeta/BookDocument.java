package appxi.cbeta;

import appxi.cbeta.xml.LinkedTxtFilter;
import appxi.cbeta.xml.LinkedXmlFilter;
import org.appxi.util.ext.HanLang;
import org.appxi.util.ext.Node;
import org.jsoup.nodes.Element;

import java.util.Objects;
import java.util.function.Function;

public class BookDocument {
    public final Bookcase bookcase;
    public final Book book;

    public BookDocument(Bookcase bookcase, Book book) {
        this.bookcase = bookcase;
        this.book = book;
    }

    private static final Object AK_CHAPTERS = new Object();

    public Node<Chapter> getChapters() {
        if (!book.hasAttr(AK_CHAPTERS)) {
            ChapterTree.getOrInitBookChapters(bookcase, book);
            book.attr(AK_CHAPTERS, true);
        }
        return this.book.chapters;
    }

    protected VolumeDocument cachedVolDocument;

    public VolumeDocument getVolumeDocument(String volume) {
        if (null != cachedVolDocument && Objects.equals(volume, cachedVolDocument.volume))
            return cachedVolDocument;
        final VolumeDocument volDocument = createVolumeDocument(volume);
        this.cachedVolDocument = volDocument;
        return volDocument;
    }

    protected VolumeDocument createVolumeDocument(String volume) {
        return new VolumeDocument(bookcase, book, volume);
    }

    public String getVolumeHtmlDocument(String volume, HanLang hanLang, Function<Element, Object> bodyWrapper, String... includes) {
        final VolumeDocument volDocument = getVolumeDocument(volume);
        return volDocument.toStandardHtmlDocument(hanLang, bodyWrapper, includes);
    }

    public String getVolumeTextDocument(String volume) {
        final VolumeDocument volDocument = getVolumeDocument(volume);
        return volDocument.toStandardTextDocument(null);
    }

    public void filterVolumeText(String volume, LinkedTxtFilter linkedFilter) {
        final VolumeDocument volDocument = getVolumeDocument(volume);
        volDocument.filterStandardText(linkedFilter);
    }

    public void filterVolumeHtml(String volume, LinkedXmlFilter linkedFilter) {
        final VolumeDocument volDocument = getVolumeDocument(volume);
        volDocument.filterStandardHtml(linkedFilter);
    }
}
