/**
 * BAD EXAMPLE: All middleware logic in one monolithic method.
 *
 * Problems:
 *  1. Authentication, logging, and rate-limiting are all tangled together.
 *  2. Adding CORS handling or caching requires editing this method.
 *  3. Can't disable a single middleware step without restructuring code.
 *  4. Impossible to reuse these checks in other services.
 */
public class RequestProcessor {

    public void process(String path, String token, String ip) {
        System.out.println("Incoming request: " + path);

        // Middleware 1: Logging
        System.out.println("[LOG] " + ip + " -> " + path);

        // Middleware 2: Rate limiting
        if (ip.equals("192.168.1.100")) {
            System.out.println("[RATE LIMIT] IP " + ip + " is blocked. Too many requests.");
            return;
        }
        System.out.println("[RATE LIMIT] OK");

        // Middleware 3: Authentication
        if (token == null || !token.equals("valid-token-123")) {
            System.out.println("[AUTH] Invalid token. Request rejected.");
            return;
        }
        System.out.println("[AUTH] Token validated.");

        // Finally: handle the request
        System.out.println("[HANDLER] Processing " + path + " ...");
        System.out.println("[HANDLER] Response: 200 OK");
    }
}
