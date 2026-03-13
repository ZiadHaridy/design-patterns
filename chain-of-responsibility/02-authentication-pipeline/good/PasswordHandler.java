import java.util.Map;

/**
 * ConcreteHandler — validates the password.
 */
public class PasswordHandler extends AuthHandler {

    private Map<String, String> credentials = Map.of(
            "admin", "secret123",
            "user1", "pass456"
    );

    @Override
    public boolean handle(AuthRequest request) {
        String expected = credentials.get(request.getUsername());
        if (expected == null || !expected.equals(request.getPassword())) {
            System.out.println("FAILED: Invalid password for '" + request.getUsername() + "'.");
            return false;
        }
        System.out.println("PASS: Password verified.");
        return super.handle(request);
    }
}
