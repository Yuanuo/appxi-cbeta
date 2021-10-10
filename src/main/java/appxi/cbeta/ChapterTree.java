package appxi.cbeta;

import org.appxi.util.ext.Node;

import java.util.Comparator;
import java.util.function.Supplier;

public class ChapterTree extends ChapterTreeParser<Node<Chapter>> {
    private static final Object AK_PARSED = new Object();

    public ChapterTree(Bookcase bookcase, Book book) {
        super(bookcase, book, getOrAddTocChapters(book), getOrAddVolChapters(book), AK_PARSED);
    }

    public ChapterTree(Bookcase bookcase, Book book, Node<Chapter> tocChapters, Node<Chapter> volChapters) {
        super(bookcase, book.removeAttr(AK_PARSED), tocChapters, volChapters, AK_PARSED);
    }

    @Override
    protected Node<Chapter> createTreeItem(Node<Chapter> parent, Chapter chapter) {
        Chapter parentVal = parent.value;
        // fix the start at first time
        if (null != parentVal.path && !parent.hasChildren() && parentVal.path.equals(chapter.path) && null != parentVal.anchor) {
            chapter.anchor = parentVal.anchor;
        }
        return parent.add(chapter);
    }

    @Override
    protected boolean existsItemInTree(String path, Node<Chapter> tree) {
        return null != tree.findFirst(n -> null != n.value && path.equals(n.value.path));
    }

    @Override
    protected void sortChildrenOfTree(Node<Chapter> tree) {
        tree.children().sort(Comparator.comparing(o -> o.value.path));
    }

    private static Node<Chapter> getOrAddTocChapters(Book book) {
        Node<Chapter> chapters = book.chapters.findFirst(node -> "tocs".equals(node.value.id));
        if (null == chapters)
            chapters = book.chapters.add(new Chapter().setId("tocs").setType("title").setTitle("章节目录"));
        return chapters;
    }

    private static Node<Chapter> getOrAddVolChapters(Book book) {
        Node<Chapter> chapters = book.chapters.findFirst(node -> "vols".equals(node.value.id));
        if (null == chapters)
            chapters = book.chapters.add(new Chapter().setId("vols").setType("title").setTitle("卷次目录"));
        return chapters;
    }

    public static ChapterTree getOrInitBookChapters(Bookcase bookcase, Book book) {
        return getOrInitBookChapters(bookcase, book, null);
    }

    public static ChapterTree getOrInitBookChapters(Bookcase bookcase, Book book, Supplier<Chapter> chapterSupplier) {
        ChapterTree tree = null == chapterSupplier
                ? new ChapterTree(bookcase, book)
                : new ChapterTree(bookcase, book) {
            @Override
            protected Chapter createChapter() {
                return chapterSupplier.get();
            }
        };
        tree.getTocChapters();
        return tree;
    }
}
