public class FileTarget implements LogTarget {
    @Override
    public void write(String level, String message) {
        System.out.println("[File  ][" + level + "] " + message);
    }
}
