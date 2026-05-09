/**
 * BAD EXAMPLE: One application class that has to know about every
 * document type and switches on a string to decide what to instantiate.
 *
 * Problems:
 *  1. Adding a new document type (e.g. Markdown) means editing this method.
 *  2. The shared workflow (open → edit → save) is tangled with the
 *     creation logic.
 *  3. Concrete document classes are referenced by name everywhere — the
 *     app is glued to them.
 */
public class DocumentApp {

    public void run(String type) {
        Object doc;

        if (type.equals("PDF")) {
            doc = new Object() {
                @Override public String toString() { return "PDF document"; }
            };
            System.out.println("Open " + doc);
            System.out.println("Edit " + doc + " (read-only mode)");
            System.out.println("Save " + doc + " as .pdf");
        } else if (type.equals("Word")) {
            doc = new Object() {
                @Override public String toString() { return "Word document"; }
            };
            System.out.println("Open " + doc);
            System.out.println("Edit " + doc + " (rich text)");
            System.out.println("Save " + doc + " as .docx");
        } else {
            throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
