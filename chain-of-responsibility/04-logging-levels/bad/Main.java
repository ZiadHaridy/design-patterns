/**
 * BAD: All log levels handled in one method. Can't route to different outputs.
 */
public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("INFO", "Application started.");
        logger.log("DEBUG", "Loading configuration from config.yml");
        logger.log("ERROR", "Database connection failed!");

        System.out.println("\nProblem: Can't route INFO to console and ERROR to file.");
        System.out.println("Adding TRACE or WARN = editing the Logger class.");
    }
}
