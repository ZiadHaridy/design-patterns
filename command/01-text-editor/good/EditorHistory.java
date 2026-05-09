import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Invoker — executes commands and maintains the undo stack.
 */
public class EditorHistory {

    private final Deque<Command> history = new ArrayDeque<>();

    public void execute(Command cmd) {
        cmd.execute();
        history.push(cmd);
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pop().undo();
        } else {
            System.out.println("[History] nothing to undo");
        }
    }
}
