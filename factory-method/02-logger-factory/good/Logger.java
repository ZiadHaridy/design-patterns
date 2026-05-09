/**
 * Product — what every logger type must support.
 */
public interface Logger {

    void log(String level, String message);
}
