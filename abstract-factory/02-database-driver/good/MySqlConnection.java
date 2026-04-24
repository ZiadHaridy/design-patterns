public class MySqlConnection implements Connection {
    @Override
    public void open() {
        System.out.println("[MySQL] open connection mysql://localhost:3306/app");
    }

    @Override
    public void close() {
        System.out.println("[MySQL] close connection");
    }
}
