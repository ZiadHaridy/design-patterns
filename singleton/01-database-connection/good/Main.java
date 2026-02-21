/**
 * GOOD: All services share the same DatabaseConnection instance.
 * Only one connection is opened, no matter how many services use it.
 */
public class Main {

    public static void main(String[] args) {
        // Service A gets the singleton instance
        DatabaseConnection connectionA = DatabaseConnection.getInstance();
        connectionA.connect();
        connectionA.executeQuery("SELECT * FROM users");

        // Service B gets the SAME instance
        DatabaseConnection connectionB = DatabaseConnection.getInstance();
        connectionB.connect(); // prints "Already connected"
        connectionB.executeQuery("SELECT * FROM orders");

        // Service C gets the SAME instance
        DatabaseConnection connectionC = DatabaseConnection.getInstance();
        connectionC.connect(); // prints "Already connected"
        connectionC.executeQuery("INSERT INTO logs VALUES ('action')");

        // Are they the same instance? YES!
        System.out.println("\nSame instance? " + (connectionA == connectionB)); // true
        System.out.println("Same instance? " + (connectionB == connectionC)); // true

        // Only 1 connection was opened — efficient!
        System.out.println("\nSuccess: Only 1 connection was opened and shared across all services.");

        connectionA.disconnect();
    }
}
