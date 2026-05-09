/** Abstraction — log severity level. Delegates writing to the LogTarget bridge. */
public abstract class Logger {

    protected final LogTarget target;

    protected Logger(LogTarget target) {
        this.target = target;
    }

    public abstract void log(String message);
}
