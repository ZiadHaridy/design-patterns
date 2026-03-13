/**
 * ConcreteHandler — L2 Technical Support handles MEDIUM severity.
 */
public class TechnicalSupport extends SupportHandler {

    @Override
    public void handle(String severity) {
        if (severity.equals("MEDIUM")) {
            System.out.println("[L2 - Technical Support]");
            System.out.println("Analyzing logs and system diagnostics...");
            System.out.println("Issue resolved by technical team.");
        } else {
            System.out.println("[L2 - Technical Support] Cannot handle " + severity + ". Escalating...");
            System.out.println();
            super.handle(severity);
        }
    }
}
