/**
 * Handler — abstract base for the logging chain.
 * Each handler checks if it handles the given level, otherwise passes along.
 */
public abstract class LogHandler {

    private LogHandler next;
    protected LogLevel level;

    public LogHandler(LogLevel level) {
        this.level = level;
    }

    public LogHandler setNext(LogHandler handler) {
        this.next = handler;
        return handler;
    }

    public void log(LogLevel msgLevel, String message) {
        if (this.level == msgLevel) {
            write(message);
        }
        // Pass to next regardless — allows multiple handlers to process
        if (next != null) {
            next.log(msgLevel, message);
        }
    }

    protected abstract void write(String message);
}
