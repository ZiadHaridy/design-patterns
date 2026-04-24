/**
 * Creator — runs the application's logging workflow but lets
 * subclasses decide which Logger to use via createLogger().
 */
public abstract class Application {

    /** Factory method. */
    protected abstract Logger createLogger();

    public final void run() {
        Logger logger = createLogger();
        logger.log("INFO",  "started");
        logger.log("WARN",  "low memory");
        logger.log("ERROR", "DB unreachable");
    }
}
