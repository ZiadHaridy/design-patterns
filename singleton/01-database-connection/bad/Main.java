/**
 * BAD: Every service creates its own DatabaseConnection.
 * This leads to multiple connections being opened unnecessarily.
 */
public class Main {

    public static void main(String[] args) {
        // Service A creates its own connection
        DatabaseConnection connectionA = new DatabaseConnection("jdbc:mysql://localhost:3306/mydb");
        connectionA.connect();
        connectionA.executeQuery("SELECT * FROM users");

        // Service B creates ANOTHER connection to the same database
        DatabaseConnection connectionB = new DatabaseConnection("jdbc:mysql://localhost:3306/mydb");
        connectionB.connect();
        connectionB.executeQuery("SELECT * FROM orders");

        // Service C creates YET ANOTHER connection
        DatabaseConnection connectionC = new DatabaseConnection("jdbc:mysql://localhost:3306/mydb");
        connectionC.connect();
        connectionC.executeQuery("INSERT INTO logs VALUES ('action')");

        // Are they the same instance? NO!
        System.out.println("\nSame instance? " + (connectionA == connectionB)); // false
        System.out.println("Same instance? " + (connectionB == connectionC)); // false

        // 3 separate connections opened to the same database — wasteful!
        System.out.println("\nProblem: 3 separate connections were opened to the same database.");

        connectionA.disconnect();
        connectionB.disconnect();
        connectionC.disconnect();
    }
}
