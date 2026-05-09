/**
 * BAD: Client and service must constantly distinguish files from folders.
 * Every traversal repeats the same instanceof + cast pattern.
 */
public class Main {

    public static void main(String[] args) {
        FileSystemService.FolderNode root = new FileSystemService.FolderNode("root");
        FileSystemService.FolderNode src = new FileSystemService.FolderNode("src");
        FileSystemService.FolderNode docs = new FileSystemService.FolderNode("docs");

        root.children.add(src);
        root.children.add(docs);
        root.children.add(new FileSystemService.FileNode("README.md", 4));

        src.children.add(new FileSystemService.FileNode("Main.java", 12));
        src.children.add(new FileSystemService.FileNode("Util.java", 8));
        docs.children.add(new FileSystemService.FileNode("guide.pdf", 220));

        FileSystemService fs = new FileSystemService();

        System.out.println("=== Tree ===");
        fs.print(root, "");

        System.out.println("\n=== Total size ===");
        System.out.println(fs.totalSize(root) + " KB");

        System.out.println("\nProblem: every operation walks the tree with instanceof.");
        System.out.println("Adding a Symlink type forces editing both totalSize() and print().");
    }
}
