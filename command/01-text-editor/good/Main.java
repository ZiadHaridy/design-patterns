/**
 * GOOD: Undo is unlimited and no if/else — each command reverses itself.
 */
public class Main {

    public static void main(String[] args) {
        TextDocument doc = new TextDocument();
        EditorHistory history = new EditorHistory();

        history.execute(new InsertCommand(doc, "Hello"));
        history.execute(new InsertCommand(doc, ", World"));
        history.execute(new DeleteCommand(doc, 6));  // delete ", World"
        history.execute(new InsertCommand(doc, "!"));

        System.out.println("\n--- undo 3 times ---");
        history.undo();
        history.undo();
        history.undo();

        System.out.println("\nSuccess: unlimited undo, no if/else in history.");
        System.out.println("Adding a BoldCommand = 1 new class, no changes to EditorHistory.");
    }
}
