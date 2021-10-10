package appxi.cbeta;

import org.appxi.prefs.UserPrefs;
import org.appxi.util.FileHelper;
import org.appxi.util.StringHelper;
import org.appxi.util.ext.HanLang;
import org.jsoup.nodes.Element;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import java.util.function.Supplier;

public class VolumeDocumentEx extends VolumeDocument {
    private static final String VERSION = "21.10.08.1";

    public VolumeDocumentEx(Bookcase bookcase, Book book, String volume) {
        super(bookcase, book, volume);
    }

    public final String getIdentificationInfo() {
        return StringHelper.concat(this.volume, "|", bookcase.getLastModifiedTime(this.volume), "|", VERSION);
    }

    @Override
    public Element getDocumentBody() {
        return super.getDocumentBody();
    }

    @Override
    public Element getStandardHtml() {
        return super.getStandardHtml();
    }

    @Override
    public String toStandardHtmlDocument(HanLang hanLang, Function<Element, Object> bodyWrapper, String... includes) {
        final StringBuilder cacheInfo = new StringBuilder(getIdentificationInfo());
        cacheInfo.append(hanLang.lang);
        cacheInfo.append(StringHelper.join("|", includes));
        //
        final Path cacheFile = UserPrefs.cacheDir().resolve(FileHelper.makeEncodedPath(cacheInfo.toString(), ".html"));
        //
        if (Files.notExists(cacheFile)) {
            final String stdHtmlDoc = super.toStandardHtmlDocument(hanLang, bodyWrapper, includes);
            final boolean success = FileHelper.writeString(stdHtmlDoc, cacheFile);
            if (success) {
//                DevtoolHelper.LOG.info("Cached : " + cacheFile.toAbsolutePath());
            } else throw new RuntimeException("cannot cache stdHtmlDoc");// for debug only
        }
        return cacheFile.toAbsolutePath().toString();
    }

    @Override
    public String toStandardTextDocument(Supplier<Element> elementSupplier) {
        final String cachePath = FileHelper.makeEncodedPath(getIdentificationInfo(), ".text");
        final Path cacheFile = UserPrefs.cacheDir().resolve(cachePath);
        if (Files.notExists(cacheFile)) {
            final String stdTextDoc = super.toStandardTextDocument(elementSupplier);
            final boolean success = FileHelper.writeString(stdTextDoc, cacheFile);
            if (success) {
//                DevtoolHelper.LOG.info("Cached : " + cacheFile.toAbsolutePath());
            } else throw new RuntimeException("cannot cache stdTextDoc");// for debug only
        }
        return cacheFile.toAbsolutePath().toString();
    }
}
