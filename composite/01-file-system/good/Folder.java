import java.util.ArrayList;
import java.util.List;

/**
 * Composite — a folder that contains files and other folders.
 * Operations are delegated to children recursively.
 */
public class Folder extends FileSystemNode {

    private final List<FileSystemNode> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Folder add(FileSystemNode node) {
        children.add(node);
        return this;
    }

    @Override
    public int totalSize() {
        int total = 0;
        for (FileSystemNode child : children) {
            total += child.totalSize();
        }
        return total;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ " + name + "/");
        for (FileSystemNode child : children) {
            child.print(indent + "  ");
        }
    }
}
