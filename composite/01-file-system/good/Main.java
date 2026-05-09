/**
 * GOOD: Client treats files and folders uniformly through FileSystemNode.
 * Adding a new node type (Symlink) means one new class — no changes here.
 */
public class Main {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder src = new Folder("src");
        Folder docs = new Folder("docs");

        root.add(src)
            .add(docs)
            .add(new File("README.md", 4));

        src.add(new File("Main.java", 12))
           .add(new File("Util.java", 8));

        docs.add(new File("guide.pdf", 220));

        System.out.println("=== Tree ===");
        root.print("");

        System.out.println("\n=== Total size ===");
        System.out.println(root.totalSize() + " KB");

        // A single leaf works the same way — no special case needed.
        FileSystemNode loneFile = new File("notes.txt", 2);
        System.out.println("\n=== Lone file ===");
        loneFile.print("");
        System.out.println("Size: " + loneFile.totalSize() + " KB");

        System.out.println("\nSuccess: no instanceof, no casts.");
        System.out.println("totalSize() and print() recurse through polymorphism.");
    }
}
