public class PostgresConnection implements Connection {
    @Override
    public void open() {
        System.out.println("[Postgres] open connection postgres://localhost:5432/app");
    }

    @Override
    public void close() {
        System.out.println("[Postgres] close connection");
    }
}
