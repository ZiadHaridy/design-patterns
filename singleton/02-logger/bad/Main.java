/**
 * BAD: Each module creates its own Logger.
 * Logs are fragmented — no single place to see all logs.
 */
public class Main {

    public static void main(String[] args) {
        // UserService creates its own logger
        Logger userLogger = new Logger();
        userLogger.log("User 'alice' logged in");
        userLogger.log("User 'alice' updated profile");

        // OrderService creates a DIFFERENT logger
        Logger orderLogger = new Logger();
        orderLogger.log("Order #101 created");
        orderLogger.log("Order #101 shipped");

        // PaymentService creates YET ANOTHER logger
        Logger paymentLogger = new Logger();
        paymentLogger.log("Payment received for Order #101");

        // Each logger only has its own logs
        System.out.println();
        userLogger.printAllLogs();    // 2 entries
        System.out.println();
        orderLogger.printAllLogs();   // 2 entries
        System.out.println();
        paymentLogger.printAllLogs(); // 1 entry

        System.out.println("\nProblem: Logs are scattered across 3 separate Logger instances.");
        System.out.println("There is no centralized log view.");
    }
}
