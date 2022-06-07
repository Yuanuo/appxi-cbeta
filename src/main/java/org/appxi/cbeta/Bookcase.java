package org.appxi.cbeta;

import org.appxi.util.NumberHelper;
import org.appxi.util.StringHelper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public interface Bookcase {
    String getPath();

    Document getIndexDocument();

    default String getVersion() {
        Element metadata = getIndexDocument().selectFirst("> metadata");
        if (null != metadata) {
            Element verEle = metadata.selectFirst("> version");
            if (null != verEle) {
                return verEle.text();
            }
        }
        return "1.0.0.0";
    }

    default String getQuarterlyVersion() {
        final Element metadata = getIndexDocument().selectFirst("> metadata");
        if (null != metadata) {
            if (metadata.hasAttr("ver"))
                return metadata.attr("ver");
            final Element dateEle = metadata.selectFirst("> date");
            if (null != dateEle) {
                final String dateStr = dateEle.text();
                if (dateStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
                    final int year = NumberHelper.toInt(dateStr.substring(0, 4), 2099);
                    final int month = NumberHelper.toInt(dateStr.substring(5, 7), 1);
                    String ver = String.valueOf(year);
                    if (month < 3) ver = StringHelper.concat(year - 1, ".Q4");
                    else if (month < 6) ver = ver.concat(".Q1");
                    else if (month < 9) ver = ver.concat(".Q2");
                    else if (month < 12) ver = ver.concat(".Q3");
                    else ver = ver.concat(".Q4");
                    metadata.attr("ver", ver);
                    return ver;
                }
            }
            metadata.attr("ver", "2099.Q4");
        }
        return "2099.Q4";
    }

    boolean exists(String path);

    long getLastModifiedTime(String path);

    InputStream getContentAsStream(String path);

    default Document getContentAsDocument(String path) {
        try (InputStream stream = getContentAsStream(path)) {
            return Jsoup.parse(stream, StandardCharsets.UTF_8.name(), "/", Parser.xmlParser());
        } catch (Throwable e) {
            e.printStackTrace();
            return Jsoup.parse("");
        }
    }
}
