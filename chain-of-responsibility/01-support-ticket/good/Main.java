/**
 * GOOD: Chain is assembled by the client. Each handler is independent.
 * Adding L4 = one new class + link it into the chain. Zero changes to existing handlers.
 */
public class Main {

    public static void main(String[] args) {
        // Build the chain: L1 → L2 → L3
        SupportHandler l1 = new BasicSupport();
        SupportHandler l2 = new TechnicalSupport();
        SupportHandler l3 = new ExpertSupport();
        l1.setNext(l2).setNext(l3);

        System.out.println("=== LOW severity ticket ===");
        l1.handle("LOW");

        System.out.println("\n=== MEDIUM severity ticket ===");
        l1.handle("MEDIUM");

        System.out.println("\n=== HIGH severity ticket ===");
        l1.handle("HIGH");

        System.out.println("\n=== CRITICAL severity ticket (no handler) ===");
        l1.handle("CRITICAL");

        System.out.println("\nSuccess: Each handler is a separate class.");
        System.out.println("Adding L4 = one new class, no changes to L1/L2/L3.");
    }
}
