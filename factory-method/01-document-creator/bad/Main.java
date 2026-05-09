/**
 * BAD: DocumentApp must change every time a new document type is added.
 */
public class Main {

    public static void main(String[] args) {
        DocumentApp app = new DocumentApp();

        System.out.println("=== PDF flow ===");
        app.run("PDF");

        System.out.println("\n=== Word flow ===");
        app.run("Word");

        System.out.println("\nProblem: shared workflow and document creation are mixed together.");
        System.out.println("Adding 'Markdown' = edit DocumentApp.run().");
    }
}
