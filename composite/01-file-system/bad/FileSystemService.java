import java.util.ArrayList;
import java.util.List;

/**
 * BAD EXAMPLE: Files and folders are completely separate types,
 * and the service has to use instanceof + casts to walk the tree.
 *
 * Problems:
 *  1. Every operation (totalSize, print, count...) must repeat the same
 *     instanceof/cast walk.
 *  2. Adding a new node type (Symlink, Archive) means editing every method.
 *  3. The client cannot treat "a single file" and "a whole folder tree"
 *     uniformly — it must always know which is which.
 */
public class FileSystemService {

    public static class FileNode {
        public String name;
        public int size;
        public FileNode(String name, int size) { this.name = name; this.size = size; }
    }

    public static class FolderNode {
        public String name;
        public List<Object> children = new ArrayList<>(); // FileNode or FolderNode
        public FolderNode(String name) { this.name = name; }
    }

    public int totalSize(Object node) {
        if (node instanceof FileNode) {
            return ((FileNode) node).size;
        } else if (node instanceof FolderNode) {
            int total = 0;
            for (Object child : ((FolderNode) node).children) {
                total += totalSize(child); // recursive instanceof everywhere
            }
            return total;
        }
        throw new IllegalArgumentException("Unknown node type");
    }

    public void print(Object node, String indent) {
        if (node instanceof FileNode) {
            FileNode f = (FileNode) node;
            System.out.println(indent + "- " + f.name + " (" + f.size + " KB)");
        } else if (node instanceof FolderNode) {
            FolderNode d = (FolderNode) node;
            System.out.println(indent + "+ " + d.name + "/");
            for (Object child : d.children) {
                print(child, indent + "  ");
            }
        }
    }
}
