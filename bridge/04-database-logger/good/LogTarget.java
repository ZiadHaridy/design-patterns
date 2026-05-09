/** Implementor — where to write the log. */
public interface LogTarget {
    void write(String level, String message);
}
