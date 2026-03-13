/**
 * BAD: Escalation path is hardcoded. SupportService must change
 * every time a new level is added or the order changes.
 */
public class Main {

    public static void main(String[] args) {
        SupportService service = new SupportService();

        System.out.println("=== LOW severity ticket ===");
        service.handleTicket("LOW");

        System.out.println("\n=== MEDIUM severity ticket ===");
        service.handleTicket("MEDIUM");

        System.out.println("\n=== HIGH severity ticket ===");
        service.handleTicket("HIGH");

        System.out.println("\nProblem: Adding L4 support = editing SupportService.");
        System.out.println("Reordering escalation = rewriting the if/else.");
    }
}
