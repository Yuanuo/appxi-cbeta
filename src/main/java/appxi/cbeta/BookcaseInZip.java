package appxi.cbeta;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class BookcaseInZip implements Bookcase {
    private final ZipFile zipFile;
    private final Document indexDocument;

    public BookcaseInZip(String zip) throws Exception {
        Document document = null;
        this.zipFile = new ZipFile(zip);
        ZipEntry xmlFile = getEntry("index.xml");
        if (null != xmlFile && !xmlFile.isDirectory())
            document = Jsoup.parse(zipFile.getInputStream(xmlFile), StandardCharsets.UTF_8.name(), "/", Parser.xmlParser());

        this.indexDocument = document;
        if (null == this.indexDocument || !validDataSources()) throw new RuntimeException();
    }

    private boolean validDataSources() {
        final String[] names = new String[]{"advance_nav.xhtml", "bookdata.txt", "bulei_nav.xhtml", "catalog.txt", "menu_nav.xhtml", "simple_nav.xhtml", "spine.txt"};
        for (String name : names) {
            final ZipEntry entry = getEntry(name);
            if (null == entry || entry.isDirectory() || entry.getSize() < 1) return false;
        }
        return true;
    }

    private ZipEntry getEntry(String path) {
        return this.zipFile.getEntry("Bookcase/CBETA/".concat(path));
    }

    @Override
    public String getPath() {
        return zipFile.getName();
    }

    @Override
    public Document getIndexDocument() {
        return indexDocument;
    }

    @Override
    public boolean exists(String path) {
        return null != getEntry(path);
    }

    @Override
    public long getLastModifiedTime(String path) {
        final ZipEntry entry = getEntry(path);
        return null == entry ? 0 : entry.getTime();
    }

    @Override
    public InputStream getContentAsStream(String path) {
        try {
            return this.zipFile.getInputStream(getEntry(path));
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }
}
