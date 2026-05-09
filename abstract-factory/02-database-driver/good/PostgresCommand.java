public class PostgresCommand implements Command {
    @Override
    public void execute(String sql) {
        System.out.println("[Postgres] execute: " + sql + "  (uses LIMIT/OFFSET syntax)");
    }
}
