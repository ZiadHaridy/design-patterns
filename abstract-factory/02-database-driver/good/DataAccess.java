/**
 * Client — speaks only to abstractions. Connection and Command are
 * guaranteed to be from the same vendor because they came from one factory.
 */
public class DataAccess {

    private final Connection connection;
    private final Command command;

    public DataAccess(DbFactory factory) {
        this.connection = factory.createConnection();
        this.command = factory.createCommand();
    }

    public void runReport() {
        connection.open();
        command.execute("SELECT * FROM users LIMIT 10");
        connection.close();
    }
}
