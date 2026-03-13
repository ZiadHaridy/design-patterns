import java.util.Map;

/**
 * ConcreteHandler — checks if the user has the required role.
 */
public class RoleHandler extends AuthHandler {

    private Map<String, String> roles = Map.of(
            "admin", "ADMIN",
            "user1", "USER"
    );

    @Override
    public boolean handle(AuthRequest request) {
        String userRole = roles.get(request.getUsername());
        if (!userRole.equals(request.getRequiredRole()) && !userRole.equals("ADMIN")) {
            System.out.println("FAILED: '" + request.getUsername() + "' lacks role '" + request.getRequiredRole() + "'.");
            return false;
        }
        System.out.println("PASS: Role '" + userRole + "' authorized.");
        return super.handle(request);
    }
}
