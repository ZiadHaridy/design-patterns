public class ConsoleTarget implements LogTarget {
    @Override
    public void write(String level, String message) {
        System.out.println("[Console][" + level + "] " + message);
    }
}
