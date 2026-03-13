/**
 * ConcreteHandler — L1 Basic Support handles LOW severity.
 */
public class BasicSupport extends SupportHandler {

    @Override
    public void handle(String severity) {
        if (severity.equals("LOW")) {
            System.out.println("[L1 - Basic Support]");
            System.out.println("Checking FAQ and knowledge base...");
            System.out.println("Issue resolved with standard procedure.");
        } else {
            System.out.println("[L1 - Basic Support] Cannot handle " + severity + ". Escalating...");
            System.out.println();
            super.handle(severity);
        }
    }
}
