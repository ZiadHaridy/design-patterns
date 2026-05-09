/**
 * ConcreteCommand — removes characters from the end, undo re-inserts them.
 */
public class DeleteCommand implements Command {

    private final TextDocument doc;
    private final int count;
    private String deleted;

    public DeleteCommand(TextDocument doc, int count) {
        this.doc = doc;
        this.count = count;
    }

    @Override
    public void execute() {
        deleted = doc.getLast(count);
        doc.deleteLast(count);
        System.out.println("[Delete " + count + " chars]  →  \"" + doc + "\"");
    }

    @Override
    public void undo() {
        doc.append(deleted);
        System.out.println("[Undo delete]  →  \"" + doc + "\"");
    }
}
