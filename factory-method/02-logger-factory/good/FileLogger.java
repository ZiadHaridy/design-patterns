/**
 * ConcreteProduct — writes to a file (simulated with stdout).
 */
public class FileLogger implements Logger {

    public FileLogger() {
        System.out.println("[setup] open log file ./app.log");
    }

    @Override
    public void log(String level, String message) {
        System.out.println("[file]   " + level + " - " + message);
    }
}
