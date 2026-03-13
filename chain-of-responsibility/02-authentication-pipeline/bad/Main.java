/**
 * BAD: All auth logic in one big method. Adding 2FA means editing it.
 */
public class Main {

    public static void main(String[] args) {
        AuthService auth = new AuthService();

        System.out.println("=== Valid admin login ===");
        auth.authenticate("admin", "secret123", "ADMIN");

        System.out.println("\n=== Wrong password ===");
        auth.authenticate("admin", "wrongpass", "ADMIN");

        System.out.println("\n=== User not found ===");
        auth.authenticate("ghost", "pass", "USER");

        System.out.println("\n=== Insufficient role ===");
        auth.authenticate("user1", "pass456", "ADMIN");

        System.out.println("\nProblem: All checks are in one method.");
        System.out.println("Adding 2FA = editing AuthService.authenticate().");
    }
}
