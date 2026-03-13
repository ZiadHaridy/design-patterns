/**
 * BAD EXAMPLE: All support escalation logic crammed into one if/else chain.
 *
 * Problems:
 *  1. Adding a new support level (e.g., L4 - External Vendor) requires editing this class.
 *  2. Each level's logic is tangled together in one method.
 *  3. Escalation rules can't be reordered or reconfigured at runtime.
 */
public class SupportService {

    public void handleTicket(String severity) {
        if (severity.equals("LOW")) {
            System.out.println("[L1 - Basic Support]");
            System.out.println("Checking FAQ and knowledge base...");
            System.out.println("Issue resolved with standard procedure.");

        } else if (severity.equals("MEDIUM")) {
            System.out.println("[L1 - Basic Support]");
            System.out.println("Cannot handle MEDIUM severity. Escalating...");
            System.out.println();
            System.out.println("[L2 - Technical Support]");
            System.out.println("Analyzing logs and system diagnostics...");
            System.out.println("Issue resolved by technical team.");

        } else if (severity.equals("HIGH")) {
            System.out.println("[L1 - Basic Support]");
            System.out.println("Cannot handle HIGH severity. Escalating...");
            System.out.println();
            System.out.println("[L2 - Technical Support]");
            System.out.println("Cannot handle HIGH severity. Escalating...");
            System.out.println();
            System.out.println("[L3 - Expert Support]");
            System.out.println("Senior engineer investigating critical issue...");
            System.out.println("Issue resolved by expert team.");

        } else {
            System.out.println("Unknown severity: " + severity);
        }
    }
}
