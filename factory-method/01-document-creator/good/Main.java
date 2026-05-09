/**
 * GOOD: The shared workflow lives in DocumentApp.run().
 * Each subclass overrides createDocument() to choose its product.
 * Adding Markdown = one new Document + one new DocumentApp subclass.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== PDF flow ===");
        new PdfApp().run();

        System.out.println("\n=== Word flow ===");
        new WordApp().run();

        System.out.println("\nSuccess: DocumentApp.run() doesn't know about PDF or Word.");
        System.out.println("Adding Markdown = 1 Document subclass + 1 DocumentApp subclass.");
    }
}
