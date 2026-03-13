import java.util.Set;

/**
 * ConcreteHandler — checks if the user exists.
 */
public class UserExistsHandler extends AuthHandler {

    private Set<String> knownUsers = Set.of("admin", "user1");

    @Override
    public boolean handle(AuthRequest request) {
        if (!knownUsers.contains(request.getUsername())) {
            System.out.println("FAILED: User '" + request.getUsername() + "' not found.");
            return false;
        }
        System.out.println("PASS: User '" + request.getUsername() + "' exists.");
        return super.handle(request);
    }
}
