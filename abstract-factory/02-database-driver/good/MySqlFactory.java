public class MySqlFactory implements DbFactory {

    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public Command createCommand() {
        return new MySqlCommand();
    }
}
