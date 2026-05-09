/**
 * BAD: One class per log-level + output-target combination.
 * Info/Warning/Error × Console/File = 6 classes.
 */
public class Main {
    public static void main(String[] args) {
        new InfoConsoleLogger().log("App started");
        new WarningConsoleLogger().log("Low memory");
        new ErrorFileLogger().log("Disk full");

        System.out.println("\nProblem: adding Database target = 3 more classes.");
    }
}
