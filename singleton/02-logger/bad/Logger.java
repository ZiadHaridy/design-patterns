import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * BAD EXAMPLE: No Singleton — every class creates its own Logger.
 *
 * Problems:
 *  1. Each Logger has its own separate log list — logs are scattered.
 *  2. No centralized view of all application logs.
 *  3. Impossible to apply a single logging format or level globally.
 */
public class Logger {

    private List<String> logs;
    private DateTimeFormatter formatter;

    public Logger() {
        this.logs = new ArrayList<>();
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(">>> New Logger instance created!");
    }

    public void log(String message) {
        String entry = "[" + LocalDateTime.now().format(formatter) + "] " + message;
        logs.add(entry);
        System.out.println(entry);
    }

    public void printAllLogs() {
        System.out.println("--- All logs in this logger ---");
        for (String log : logs) {
            System.out.println(log);
        }
        System.out.println("Total: " + logs.size() + " entries");
    }
}
