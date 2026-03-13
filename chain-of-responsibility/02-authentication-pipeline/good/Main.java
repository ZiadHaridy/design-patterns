/**
 * GOOD: Each auth check is an independent handler in a chain.
 * Adding 2FA = one new handler class, link it into the chain.
 */
public class Main {

    public static void main(String[] args) {
        // Build the chain: UserExists → Password → Role → RateLimit
        AuthHandler userExists = new UserExistsHandler();
        AuthHandler password = new PasswordHandler();
        AuthHandler role = new RoleHandler();
        AuthHandler rateLimit = new RateLimitHandler();
        userExists.setNext(password).setNext(role).setNext(rateLimit);

        System.out.println("=== Valid admin login ===");
        boolean result1 = userExists.handle(new AuthRequest("admin", "secret123", "ADMIN"));
        System.out.println("Result: " + (result1 ? "SUCCESS" : "DENIED"));

        System.out.println("\n=== Wrong password ===");
        boolean result2 = userExists.handle(new AuthRequest("admin", "wrongpass", "ADMIN"));
        System.out.println("Result: " + (result2 ? "SUCCESS" : "DENIED"));

        System.out.println("\n=== User not found ===");
        boolean result3 = userExists.handle(new AuthRequest("ghost", "pass", "USER"));
        System.out.println("Result: " + (result3 ? "SUCCESS" : "DENIED"));

        System.out.println("\n=== Insufficient role ===");
        boolean result4 = userExists.handle(new AuthRequest("user1", "pass456", "ADMIN"));
        System.out.println("Result: " + (result4 ? "SUCCESS" : "DENIED"));

        System.out.println("\nSuccess: Each check is independent and testable.");
        System.out.println("Adding 2FA = one new handler, zero changes to existing ones.");
    }
}
