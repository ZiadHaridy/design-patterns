/**
 * Handler — abstract base class for the support chain.
 * Each handler either resolves the ticket or passes it to the next.
 */
public abstract class SupportHandler {

    private SupportHandler next;

    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler; // allows chaining: a.setNext(b).setNext(c)
    }

    public void handle(String severity) {
        if (next != null) {
            next.handle(severity);
        } else {
            System.out.println("No handler could resolve the ticket. Ticket remains open.");
        }
    }
}
