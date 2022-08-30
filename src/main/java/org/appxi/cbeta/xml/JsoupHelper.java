package org.appxi.cbeta.xml;

import org.appxi.util.FileHelper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsoupHelper {
    private static final String UTF_8 = "UTF-8";

    public static Document xml(String file) {
        return xml(file, UTF_8);
    }

    public static Document xml(String file, String charset) {
        try (InputStream stream = new FileInputStream(file)) {
            return xml(stream, charset);
        } catch (Exception e) {
            e.printStackTrace();
            return Jsoup.parse("");
        }
    }

    public static Document xml(Path file) {
        return xml(file, UTF_8);
    }

    public static Document xml(Path file, String charset) {
        try (InputStream stream = new BufferedInputStream(Files.newInputStream(file))) {
            return xml(stream, charset);
        } catch (Exception e) {
            e.printStackTrace();
            return Jsoup.parse("");
        }
    }

    public static Document xml(InputStream inputStream) {
        return xml(inputStream, UTF_8);
    }

    public static Document xml(InputStream inputStream, String charset) {
        try {
            return Jsoup.parse(inputStream, charset, "", Parser.xmlParser());
        } catch (Exception e) {
            e.printStackTrace();
            return Jsoup.parse("");
        }
    }

    public static boolean saveXml(Document document, Path targetFile) {
        return saveDocument(document, targetFile, true);
    }

    public static boolean saveHtml(Document document, Path targetFile) {
        return saveDocument(document, targetFile, false);
    }

    public static boolean saveDocument(Document document, Path targetFile, boolean xmlMode) {
        FileHelper.makeParents(targetFile);
//        DevtoolHelper.LOG.info(StringHelper.concat2("\tSave document: ", targetFile));
        try {
            if (xmlMode) {
                document.outputSettings().prettyPrint(false).syntax(Document.OutputSettings.Syntax.xml);
            }
            Files.writeString(targetFile, document.outerHtml());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
