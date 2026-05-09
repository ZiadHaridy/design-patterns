public class MySqlCommand implements Command {
    @Override
    public void execute(String sql) {
        System.out.println("[MySQL] execute: " + sql + "  (uses LIMIT syntax)");
    }
}
