public class DatabaseTarget implements LogTarget {
    @Override
    public void write(String level, String message) {
        System.out.println("[DB    ][" + level + "] INSERT log (level='" + level + "', msg='" + message + "')");
    }
}
