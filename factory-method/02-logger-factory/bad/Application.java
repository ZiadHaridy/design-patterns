/**
 * BAD EXAMPLE: An application that creates its logger inline based on a config flag.
 *
 * Problems:
 *  1. Application knows about every concrete logger class (FileLogger, ConsoleLogger).
 *  2. Adding a new logger type (RemoteLogger) means editing this method.
 *  3. The "log a few messages" workflow is mixed with the "decide which logger" decision.
 */
public class Application {

    public void run(String loggerType) {
        Object logger;

        if (loggerType.equals("file")) {
            System.out.println("[setup] open log file ./app.log");
            logger = "FILE";
        } else if (loggerType.equals("console")) {
            System.out.println("[setup] using stdout");
            logger = "CONSOLE";
        } else {
            throw new IllegalArgumentException("Unknown logger: " + loggerType);
        }

        // workflow
        log(logger, "INFO",  "started");
        log(logger, "WARN",  "low memory");
        log(logger, "ERROR", "DB unreachable");
    }

    private void log(Object logger, String level, String msg) {
        if (logger.equals("FILE")) {
            System.out.println("[file]   " + level + " - " + msg);
        } else if (logger.equals("CONSOLE")) {
            System.out.println("[stdout] " + level + " - " + msg);
        }
    }
}
