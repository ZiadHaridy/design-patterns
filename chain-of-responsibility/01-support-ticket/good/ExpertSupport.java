/**
 * ConcreteHandler — L3 Expert Support handles HIGH severity.
 */
public class ExpertSupport extends SupportHandler {

    @Override
    public void handle(String severity) {
        if (severity.equals("HIGH")) {
            System.out.println("[L3 - Expert Support]");
            System.out.println("Senior engineer investigating critical issue...");
            System.out.println("Issue resolved by expert team.");
        } else {
            System.out.println("[L3 - Expert Support] Cannot handle " + severity + ". Escalating...");
            System.out.println();
            super.handle(severity);
        }
    }
}
