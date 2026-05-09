/**
 * GOOD: 3 levels + 3 targets = 6 classes total, not 9 combo classes.
 * Any level works with any target — mix freely.
 */
public class Main {

    public static void main(String[] args) {
        LogTarget console = new ConsoleTarget();
        LogTarget file    = new FileTarget();
        LogTarget db      = new DatabaseTarget();

        new InfoLogger(console).log("App started");
        new WarningLogger(file).log("Low memory");
        new ErrorLogger(db).log("Disk full");

        // Same message type, different target.
        new ErrorLogger(console).log("Disk full");

        System.out.println("\nSuccess: 3 levels × 3 targets needed 6 classes, not 9.");
    }
}
