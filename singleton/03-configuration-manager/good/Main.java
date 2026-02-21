/**
 * GOOD: All modules share the same ConfigurationManager instance.
 * Changes made by one module are immediately visible to all others.
 */
public class Main {

    public static void main(String[] args) {
        // Module A gets the singleton config
        ConfigurationManager configA = ConfigurationManager.getInstance();
        System.out.println("Module A reads log.level: " + configA.get("log.level"));

        // Module A changes the log level
        configA.set("log.level", "DEBUG");
        System.out.println("Module A reads log.level: " + configA.get("log.level"));

        // Module B gets the SAME config — sees Module A's change!
        ConfigurationManager configB = ConfigurationManager.getInstance();
        System.out.println("Module B reads log.level: " + configB.get("log.level"));

        // Consistent!
        System.out.println("\nSame instance? " + (configA == configB)); // true
        System.out.println("Module A log.level: " + configA.get("log.level")); // DEBUG
        System.out.println("Module B log.level: " + configB.get("log.level")); // DEBUG

        System.out.println("\nSuccess: Config is consistent across all modules!");
    }
}
