/**
 * ConcreteProduct — a Word document.
 */
public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Open Word document");
    }

    @Override
    public void edit() {
        System.out.println("Edit Word document (rich text)");
    }

    @Override
    public void save() {
        System.out.println("Save Word document as .docx");
    }
}
