/**
 * GOOD EXAMPLE: Singleton DatabaseConnection.
 *
 * Benefits:
 *  1. Only ONE connection is created and reused everywhere.
 *  2. Saves memory and database resources.
 *  3. Central control over the connection lifecycle.
 */
public class DatabaseConnection {

    // 1. Private static field to hold the single instance
    private static DatabaseConnection instance;

    private String connectionUrl;
    private boolean connected;

    // 2. Private constructor — no one else can instantiate
    private DatabaseConnection(String url) {
        this.connectionUrl = url;
        this.connected = false;
    }

    // 3. Public static method — global access point
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection("jdbc:mysql://localhost:3306/mydb");
        }
        return instance;
    }

    public void connect() {
        if (!connected) {
            System.out.println("Opening database connection to: " + connectionUrl);
            this.connected = true;
        } else {
            System.out.println("Already connected — reusing existing connection.");
        }
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
