/**
 * Component — common interface for files and folders.
 * Clients call these methods without caring whether the node is a leaf or a composite.
 */
public abstract class FileSystemNode {

    protected final String name;

    protected FileSystemNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int totalSize();

    public abstract void print(String indent);
}
