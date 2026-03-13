/**
 * ConcreteHandler — writes DEBUG messages to console with extra detail.
 */
public class DebugLogger extends LogHandler {

    public DebugLogger() {
        super(LogLevel.DEBUG);
    }

    @Override
    protected void write(String message) {
        System.out.println("[DEBUG] " + message);
        System.out.println("[DEBUG] (Thread: " + Thread.currentThread().getName() + ")");
    }
}
