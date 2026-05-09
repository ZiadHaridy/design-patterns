/**
 * ConcreteProduct — writes to stdout.
 */
public class ConsoleLogger implements Logger {

    public ConsoleLogger() {
        System.out.println("[setup] using stdout");
    }

    @Override
    public void log(String level, String message) {
        System.out.println("[stdout] " + level + " - " + message);
    }
}
