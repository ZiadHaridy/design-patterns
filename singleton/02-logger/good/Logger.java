import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * GOOD EXAMPLE: Singleton Logger.
 *
 * Benefits:
 *  1. All logs are collected in ONE place.
 *  2. Centralized log format and level control.
 *  3. Any module can call Logger.getInstance() to log consistently.
 */
public class Logger {

    private static Logger instance;

    private List<String> logs;
    private DateTimeFormatter formatter;

    private Logger() {
        this.logs = new ArrayList<>();
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(">>> Logger instance created (only once).");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        String entry = "[" + LocalDateTime.now().format(formatter) + "] " + message;
        logs.add(entry);
        System.out.println(entry);
    }

    public void printAllLogs() {
        System.out.println("--- All application logs ---");
        for (String log : logs) {
            System.out.println(log);
        }
        System.out.println("Total: " + logs.size() + " entries");
    }
}
