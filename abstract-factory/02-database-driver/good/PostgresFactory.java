public class PostgresFactory implements DbFactory {

    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }

    @Override
    public Command createCommand() {
        return new PostgresCommand();
    }
}
