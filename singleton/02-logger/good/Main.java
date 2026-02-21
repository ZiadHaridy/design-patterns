/**
 * GOOD: All modules share the same Logger instance.
 * Every log entry goes to one centralized place.
 */
public class Main {

    public static void main(String[] args) {
        // UserService gets the singleton logger
        Logger userLogger = Logger.getInstance();
        userLogger.log("User 'alice' logged in");
        userLogger.log("User 'alice' updated profile");

        // OrderService gets the SAME logger
        Logger orderLogger = Logger.getInstance();
        orderLogger.log("Order #101 created");
        orderLogger.log("Order #101 shipped");

        // PaymentService gets the SAME logger
        Logger paymentLogger = Logger.getInstance();
        paymentLogger.log("Payment received for Order #101");

        // All logs are in one place
        System.out.println();
        Logger.getInstance().printAllLogs(); // 5 entries — all together!

        // Confirm same instance
        System.out.println("\nSame instance? " + (userLogger == orderLogger));   // true
        System.out.println("Same instance? " + (orderLogger == paymentLogger)); // true
    }
}
