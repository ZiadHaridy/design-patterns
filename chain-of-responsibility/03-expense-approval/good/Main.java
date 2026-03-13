/**
 * GOOD: Each approval level is a handler. Chain determines who approves.
 * Adding CEO = one new class + link it after VP.
 */
public class Main {

    public static void main(String[] args) {
        // Build the chain: Manager → Director → VP
        Approver manager = new Manager();
        Approver director = new Director();
        Approver vp = new VicePresident();
        manager.setNext(director).setNext(vp);

        System.out.println("=== $50 expense ===");
        manager.approve("Alice", 50);

        System.out.println("\n=== $500 expense ===");
        manager.approve("Bob", 500);

        System.out.println("\n=== $5,000 expense ===");
        manager.approve("Charlie", 5000);

        System.out.println("\n=== $50,000 expense (exceeds all limits) ===");
        manager.approve("Diana", 50000);

        System.out.println("\nSuccess: Each approver is self-contained.");
        System.out.println("Limits are configurable. Adding CEO = one new class.");
    }
}
