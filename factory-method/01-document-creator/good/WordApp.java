/**
 * ConcreteCreator — a DocumentApp that produces WordDocuments.
 */
public class WordApp extends DocumentApp {

    @Override
    protected Document createDocument() {
        return new WordDocument();
    }
}
