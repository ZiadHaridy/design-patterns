/**
 * ConcreteCommand — appends text, undo removes it.
 */
public class InsertCommand implements Command {

    private final TextDocument doc;
    private final String text;

    public InsertCommand(TextDocument doc, String text) {
        this.doc = doc;
        this.text = text;
    }

    @Override
    public void execute() {
        doc.append(text);
        System.out.println("[Insert '" + text + "']  →  \"" + doc + "\"");
    }

    @Override
    public void undo() {
        doc.deleteLast(text.length());
        System.out.println("[Undo insert '" + text + "']  →  \"" + doc + "\"");
    }
}
