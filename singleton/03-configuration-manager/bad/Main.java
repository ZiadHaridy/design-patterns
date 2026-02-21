/**
 * BAD: Multiple ConfigurationManager instances lead to inconsistent config.
 */
public class Main {

    public static void main(String[] args) {
        // Module A loads config
        ConfigurationManager configA = new ConfigurationManager();
        System.out.println("Module A reads log.level: " + configA.get("log.level"));

        // Module A changes the log level
        configA.set("log.level", "DEBUG");
        System.out.println("Module A reads log.level: " + configA.get("log.level"));

        // Module B loads its OWN config — doesn't see Module A's change!
        ConfigurationManager configB = new ConfigurationManager();
        System.out.println("Module B reads log.level: " + configB.get("log.level"));

        // Inconsistency!
        System.out.println("\nSame instance? " + (configA == configB)); // false
        System.out.println("Module A log.level: " + configA.get("log.level")); // DEBUG
        System.out.println("Module B log.level: " + configB.get("log.level")); // INFO

        System.out.println("\nProblem: Config is inconsistent across modules!");
    }
}
