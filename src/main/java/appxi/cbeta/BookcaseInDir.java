package appxi.cbeta;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class BookcaseInDir implements Bookcase {
    private final Path directory;
    private final Document indexDocument;

    public BookcaseInDir(String dir) throws Exception {
        Path directory = null;
        Document document = null;
        for (String path : new String[]{"", "CBETA", "Bookcase/CBETA", "cbeta/Bookcase/CBETA"}) {
            final Path file = Path.of(null == dir ? "" : dir).resolve(path).resolve("index.xml");
            if (Files.exists(file) && Files.isRegularFile(file) && Files.isReadable(file)) {
                try (InputStream stream = Files.newInputStream(file)) {
                    document = Jsoup.parse(stream, StandardCharsets.UTF_8.name(), "/", Parser.xmlParser());
                    directory = file.getParent();
                    break;
                }
            }
        }
        this.directory = directory;
        this.indexDocument = document;
        if (null == this.indexDocument || null == this.directory || !validDataSources())
            throw new RuntimeException();
    }

    private boolean validDataSources() {
        if (Files.notExists(directory))
            return false;
        if (!Files.isDirectory(directory))
            return false;
        if (!Files.isReadable(directory))
            return false;

        final String[] names = new String[]{"advance_nav.xhtml", "bookdata.txt", "bulei_nav.xhtml", "catalog.txt",
                "menu_nav.xhtml", "simple_nav.xhtml", "spine.txt"};
        for (String name : names) {
            final Path file = directory.resolve(name);
            if (Files.notExists(file))
                return false;
            if (Files.isDirectory(file))
                return false;
            if (!Files.isReadable(file))
                return false;
            try {
                if (Files.size(file) < 1)
                    return false;
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getPath() {
        return directory.toString();
    }

    @Override
    public Document getIndexDocument() {
        return indexDocument;
    }

    @Override
    public boolean exists(String path) {
        return Files.exists(this.directory.resolve(path));
    }

    @Override
    public long getLastModifiedTime(String path) {
        try {
            long time = Files.getLastModifiedTime(this.directory.resolve(path)).toMillis();
            return time - time % 1000;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public InputStream getContentAsStream(String path) {
        try {
            return Files.newInputStream(this.directory.resolve(path));
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }
}
