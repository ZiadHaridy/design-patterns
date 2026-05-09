/**
 * Leaf — a single file with its own size. Has no children.
 */
public class File extends FileSystemNode {

    private final int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int totalSize() {
        return size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "- " + name + " (" + size + " KB)");
    }
}
