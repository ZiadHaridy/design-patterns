/**
 * BAD: All middleware in one method. Can't add/remove/reorder steps.
 */
public class Main {

    public static void main(String[] args) {
        RequestProcessor processor = new RequestProcessor();

        System.out.println("=== Valid request ===");
        processor.process("/api/users", "valid-token-123", "10.0.0.1");

        System.out.println("\n=== Rate-limited IP ===");
        processor.process("/api/users", "valid-token-123", "192.168.1.100");

        System.out.println("\n=== Invalid token ===");
        processor.process("/api/users", "bad-token", "10.0.0.1");

        System.out.println("\nProblem: Can't add CORS middleware without editing RequestProcessor.");
        System.out.println("Can't disable logging without commenting out code.");
    }
}
