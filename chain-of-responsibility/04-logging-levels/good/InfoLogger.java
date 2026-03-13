/**
 * ConcreteHandler — writes INFO messages to console.
 */
public class InfoLogger extends LogHandler {

    public InfoLogger() {
        super(LogLevel.INFO);
    }

    @Override
    protected void write(String message) {
        System.out.println("[INFO] " + message);
    }
}
