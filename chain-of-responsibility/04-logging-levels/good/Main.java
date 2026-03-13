/**
 * GOOD: Each log level has its own handler with its own output.
 * The chain passes messages through — each handler decides if it cares.
 */
public class Main {

    public static void main(String[] args) {
        // Build the chain: Info → Debug → Error
        LogHandler info = new InfoLogger();
        LogHandler debug = new DebugLogger();
        LogHandler error = new ErrorLogger();
        info.setNext(debug).setNext(error);

        System.out.println("=== Logging messages ===");
        info.log(LogLevel.INFO, "Application started.");
        System.out.println();

        info.log(LogLevel.DEBUG, "Loading configuration from config.yml");
        System.out.println();

        info.log(LogLevel.ERROR, "Database connection failed!");

        System.out.println();
        System.out.println("Success: INFO goes to console, ERROR goes to stderr + alert.");
        System.out.println("Adding WARNING = one new class, zero changes to existing loggers.");
    }
}
