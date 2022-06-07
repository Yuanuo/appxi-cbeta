package org.appxi.cbeta;

import org.appxi.cbeta.xml.ElementVisitor;
import org.appxi.cbeta.xml.LinkedTxtFilter;
import org.appxi.cbeta.xml.LinkedXmlFilter;
import org.appxi.util.DigestHelper;
import org.appxi.util.FileHelper;
import org.appxi.util.StringHelper;
import org.appxi.util.ext.HanLang;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.select.NodeTraversor;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class VolumeDocument {
    public final Bookcase bookcase;
    public final Book book;
    public final String volume;

    private Document document;
    private int simpleIdCounter = 1;

    public VolumeDocument(Bookcase bookcase, Book book, String volume) {
        this.bookcase = bookcase;
        this.book = book;
        this.volume = volume;
    }

    public boolean exists() {
        return bookcase.exists(this.volume);
    }

    public boolean isXmlVolume() {
        return volume.endsWith(".xml") && volume.startsWith("XML/");
    }

    public Document getDocument() {
        if (null != this.document)
            return this.document;
        //
        if (!this.exists()) {
            this.document = Jsoup.parse("");
        } else {
            try (InputStream stream = bookcase.getContentAsStream(this.volume)) {
//                DevtoolHelper.LOG.info(StringHelper.concat2("Jsoup.parseXml: " + this.volumeFile.toAbsolutePath()));
                this.document = Jsoup.parse(stream, "UTF-8", "/", isXmlVolume() ? Parser.xmlParser() : Parser.htmlParser());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        //
        return this.document;
    }

    public Element getDocumentBody() {
        Document document = this.getDocument();
        return isXmlVolume() ? document.selectFirst("> TEI > text > body") : document.body();
    }

    public String ensureId(Element element) {
        return ensureId(element, this.volume);
    }

    public String ensureId(Element element, String salt) {
        String id = element.id();
        if (!id.isBlank())
            return id;
        id = element.attr("xml:id");
        if (id.isBlank()) {
            id = String.valueOf(simpleIdCounter++);
            id = null == salt ? id : DigestHelper.crc32c(id, salt);
            id = StringHelper.concat('z', id);
        }
        element.attr("id", id);
        return id;
    }

    public Element getDeclarationChar(String id) {
        if (null == id || id.isBlank())
            return null; // not a valid ele
        if (id.charAt(0) == '#')
            id = id.substring(1);
        return this.getDocument().selectFirst("> TEI > teiHeader > encodingDesc > charDecl > char[xml:id=" + id + "]");
    }

    public String getDeclarationText(String id) {
        final Element declareChar = getDeclarationChar(id);
        if (null == declareChar)
            return "@Declare@" + id;

        Element propEle = declareChar.selectFirst("> charProp > localName:contains(normalized form)");
        if (null == propEle)
            propEle = declareChar.selectFirst("> charProp > localName:contains(composition)");
        if (null == propEle)
            propEle = declareChar.selectFirst("> charProp > localName:contains(Character in the Siddham font)");
        if (null == propEle) {
            // FIXME
            return declareChar.selectFirst("charName").text();
        }
        return propEle.nextElementSibling().text();
    }

    protected String getElementText(Element element) {
        final VolumeXml2TextProcessor processor = new VolumeXml2TextProcessor(this);
        NodeTraversor.filter(processor, element);
        return processor.toString();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void filterStandardText(LinkedTxtFilter linkedFilter) {
        final VolumeXml2TextProcessor processor = new VolumeXml2TextProcessor(this, linkedFilter);
        NodeTraversor.filter(processor, getDocumentBody());
    }

    public void filterStandardHtml(LinkedXmlFilter linkedFilter) {
        final VolumeXml2HtmlProcessor processor = new VolumeXml2HtmlProcessor(this, linkedFilter);
        NodeTraversor.filter(processor, getDocumentBody());
    }

    public String getStandardText() {
        if (!isXmlVolume())
            return this.getDocumentBody().text();
        return getStandardText((String) null, null);
    }

    public String getStandardText(String startSelector, String stopSelector) {
        return getStandardText(null == startSelector ? null : (ele) -> ele.is(startSelector),
                null == stopSelector ? null : (ele) -> ele.is(stopSelector));
    }

    public String getStandardText(Predicate<Element> startFilter, Predicate<Element> stopFilter) {
        final VolumeXml2TextProcessor processor = new VolumeXml2TextProcessor(this,
                new LinkedTxtFilter(startFilter, stopFilter, null));
        NodeTraversor.filter(processor, getDocumentBody());
        return processor.toString();
    }


    public Element getStandardHtml() {
        if (!isXmlVolume())
            return this.getDocument();
        return getStandardHtml((Predicate<Element>) null, null);
    }

    public Element getStandardHtml(String startSelector, String stopSelector) {
        return getStandardHtml(null == startSelector ? null : (ele) -> ele.is(startSelector),
                null == stopSelector ? null : (ele) -> ele.is(stopSelector));
    }

    public Element getStandardHtml(Predicate<Element> startFilter, Predicate<Element> stopFilter) {
        final VolumeXml2HtmlProcessor processor = new VolumeXml2HtmlProcessor(this,
                new LinkedXmlFilter(startFilter, stopFilter, null));
        NodeTraversor.filter(processor, getDocumentBody());
        return processor.toElement();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String toStandardHtmlDocument(HanLang hanLang, Function<Element, Object> bodyWrapper, String... includes) {
        final StringBuilder buf = new StringBuilder();
        buf.append("<!DOCTYPE html><html lang=\"").append(hanLang.lang).append("\"><head><meta charset=\"UTF-8\">");
        //
        final List<String> scripts = new ArrayList<>(), styles = new ArrayList<>();
        for (String include : includes) {
            if (include.endsWith(".js")) {
                buf.append("\r\n<script type=\"text/javascript\" src=\"").append(include).append("\"></script>");
            } else if (include.endsWith(".css")) {
                buf.append("\r\n<link rel=\"stylesheet\" href=\"").append(include).append("\"/>");
            } else if (include.startsWith("<script") || include.startsWith("<style")
                    || include.startsWith("<link") || include.startsWith("<meta")) {
                buf.append("\r\n").append(include);
            } else if (include.startsWith("var ") || include.startsWith("function")) {
                scripts.add(include);
            } else {
                styles.add(include);
            }
        }
        if (!scripts.isEmpty()) {
            buf.append("\r\n<script type=\"text/javascript\">").append(StringHelper.joinLines(scripts)).append("</script>");
        }
        if (!styles.isEmpty()) {
            buf.append("\r\n<style type=\"text/css\">").append(StringHelper.joinLines(styles)).append("</style>");
        }
        //
        buf.append("</head>");
        final Element body = isXmlVolume() ? this.getStandardHtml() : getDocumentBody();
        tryEmbedExternalResources(body);
        if (null == bodyWrapper) {
            buf.append(body.outerHtml());
        } else {
            final Object bodyWrapped = bodyWrapper.apply(body);
            if (bodyWrapped instanceof Node node) {
                buf.append(node.outerHtml());
            } else {
                final String bodyHtml = bodyWrapped.toString();
                if (bodyHtml.startsWith("<body"))
                    buf.append(bodyHtml);
                else buf.append("<body>").append(bodyHtml).append("</body>");
            }
        }
        buf.append("</html>");
        return buf.toString();
    }

    private void tryEmbedExternalResources(Element body) {
        body.traverse(new ElementVisitor() {
            @Override
            protected void head(Element ele, int depth) {
                if (ele.is("img") && ele.hasAttr("src")) {
                    String src = ele.attr("src");
                    if (src.startsWith("../")) {
                        src = src.substring(3);
                    } else {
                        src = volume.substring(0, volume.lastIndexOf('/') + 1).concat(src);
                    }
                    src = src.replace("//", "/");
                    try (InputStream srcStream = bookcase.getContentAsStream(src)) {
                        String imageType = src.substring(src.lastIndexOf('.') + 1);

                        byte[] imageBytes = FileHelper.readFully(srcStream);
                        ele.attr("src", "data:image/".concat(imageType).concat(";base64,")
                                .concat(Base64.getEncoder().encodeToString(imageBytes)));
                    } catch (Exception i) {
                        i.printStackTrace();
                    }
                }
            }
        });
    }

    public String toStandardTextDocument(Supplier<Element> elementSupplier) {
        Element element = null != elementSupplier ? elementSupplier.get() : null;
        return null != element ? element.text() : this.getStandardText();
    }
}
