/**
 * GOOD: Each middleware is a separate handler in a chain.
 * Add/remove/reorder middleware by changing the chain setup — not the code.
 */
public class Main {

    public static void main(String[] args) {
        // Build middleware chain: Logging → RateLimit → Auth
        Middleware logging = new LoggingMiddleware();
        Middleware rateLimit = new RateLimitMiddleware();
        Middleware auth = new AuthMiddleware();
        logging.setNext(rateLimit).setNext(auth);

        System.out.println("=== Valid request ===");
        boolean result1 = logging.handle(new HttpRequest("/api/users", "valid-token-123", "10.0.0.1"));
        System.out.println("Result: " + (result1 ? "200 OK" : "REJECTED"));

        System.out.println("\n=== Rate-limited IP ===");
        boolean result2 = logging.handle(new HttpRequest("/api/users", "valid-token-123", "192.168.1.100"));
        System.out.println("Result: " + (result2 ? "200 OK" : "REJECTED"));

        System.out.println("\n=== Invalid token ===");
        boolean result3 = logging.handle(new HttpRequest("/api/users", "bad-token", "10.0.0.1"));
        System.out.println("Result: " + (result3 ? "200 OK" : "REJECTED"));

        System.out.println();
        System.out.println("Success: Each middleware is independent and reusable.");
        System.out.println("Adding CORS middleware = one new class, link it into the chain.");
        System.out.println("Disabling logging = just remove it from the chain setup.");
    }
}
