/**
 * ConcreteHandler — writes ERROR messages to stderr (simulating file/alert).
 */
public class ErrorLogger extends LogHandler {

    public ErrorLogger() {
        super(LogLevel.ERROR);
    }

    @Override
    protected void write(String message) {
        System.err.println("[ERROR] " + message);
        System.err.println("[ERROR] Alert sent to monitoring system.");
    }
}
