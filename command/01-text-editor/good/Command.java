/**
 * Command — every editor operation implements this.
 */
public interface Command {
    void execute();
    void undo();
}
