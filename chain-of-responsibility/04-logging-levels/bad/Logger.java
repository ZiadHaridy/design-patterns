/**
 * BAD EXAMPLE: Logging level logic in one big if/else.
 *
 * Problems:
 *  1. Each level's output is hardcoded in one method.
 *  2. Adding a new level (e.g., TRACE) requires editing this class.
 *  3. Can't configure which levels are active at runtime.
 *  4. Can't route different levels to different outputs (file, console, remote).
 */
public class Logger {

    public void log(String level, String message) {
        if (level.equals("INFO")) {
            System.out.println("[INFO] " + message);

        } else if (level.equals("DEBUG")) {
            System.out.println("[DEBUG] " + message);

        } else if (level.equals("ERROR")) {
            System.err.println("[ERROR] " + message);
            System.err.println("[ERROR] Stack trace would be printed here.");

        } else {
            System.out.println("[UNKNOWN] " + message);
        }
    }
}
