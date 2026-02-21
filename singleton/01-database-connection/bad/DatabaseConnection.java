/**
 * BAD EXAMPLE: No Singleton — every caller creates a new database connection.
 *
 * Problems:
 *  1. Each "new DatabaseConnection()" opens a separate connection.
 *  2. Wastes memory and database resources.
 *  3. No central control over the connection lifecycle.
 */
public class DatabaseConnection {

    private String connectionUrl;
    private boolean connected;

    public DatabaseConnection(String url) {
        this.connectionUrl = url;
        this.connected = false;
    }

    public void connect() {
        // Simulate opening a heavy database connection
        System.out.println("Opening NEW database connection to: " + connectionUrl);
        this.connected = true;
    }

    public void executeQuery(String query) {
        if (!connected) {
            throw new IllegalStateException("Not connected to database!");
        }
        System.out.println("Executing query: " + query);
    }

    public void disconnect() {
        System.out.println("Closing database connection to: " + connectionUrl);
        this.connected = false;
    }
}
