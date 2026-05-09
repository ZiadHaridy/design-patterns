/**
 * GOOD: Application.run() doesn't know about FileLogger or ConsoleLogger.
 * Each subclass picks its logger.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== console mode ===");
        new ConsoleLoggingApp().run();

        System.out.println("\n=== file mode ===");
        new FileLoggingApp().run();

        System.out.println("\nSuccess: adding RemoteLogger = 1 Logger + 1 Application subclass.");
        System.out.println("Application.run() never changes.");
    }
}
