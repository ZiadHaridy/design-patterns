import java.util.Map;
import java.util.HashMap;

/**
 * BAD EXAMPLE: All authentication checks crammed into one method.
 *
 * Problems:
 *  1. Adding a new check (e.g., 2FA) requires editing this method.
 *  2. Can't reorder or skip checks without restructuring the code.
 *  3. All validation logic is tangled — hard to test each check independently.
 */
public class AuthService {

    private Map<String, String> users = new HashMap<>();
    private Map<String, String> roles = new HashMap<>();

    public AuthService() {
        users.put("admin", "secret123");
        users.put("user1", "pass456");
        roles.put("admin", "ADMIN");
        roles.put("user1", "USER");
    }

    public boolean authenticate(String username, String password, String requiredRole) {
        // Check 1: Username exists
        if (!users.containsKey(username)) {
            System.out.println("FAILED: User '" + username + "' not found.");
            return false;
        }

        // Check 2: Password matches
        if (!users.get(username).equals(password)) {
            System.out.println("FAILED: Invalid password for '" + username + "'.");
            return false;
        }

        // Check 3: Role authorization
        String userRole = roles.get(username);
        if (!userRole.equals(requiredRole) && !userRole.equals("ADMIN")) {
            System.out.println("FAILED: User '" + username + "' lacks role '" + requiredRole + "'.");
            return false;
        }

        // Check 4: Rate limiting (simplified)
        System.out.println("Checking rate limit for '" + username + "'... OK");

        System.out.println("SUCCESS: '" + username + "' authenticated and authorized.");
        return true;
    }
}
