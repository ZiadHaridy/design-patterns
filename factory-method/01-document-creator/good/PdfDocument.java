/**
 * ConcreteProduct — a PDF.
 */
public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Open PDF document");
    }

    @Override
    public void edit() {
        System.out.println("Edit PDF document (read-only mode)");
    }

    @Override
    public void save() {
        System.out.println("Save PDF document as .pdf");
    }
}
