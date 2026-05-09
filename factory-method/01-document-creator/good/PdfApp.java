/**
 * ConcreteCreator — a DocumentApp that produces PdfDocuments.
 */
public class PdfApp extends DocumentApp {

    @Override
    protected Document createDocument() {
        return new PdfDocument();
    }
}
