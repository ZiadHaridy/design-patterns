/**
 * Request object — carries authentication data through the chain.
 */
public class AuthRequest {

    private String username;
    private String password;
    private String requiredRole;

    public AuthRequest(String username, String password, String requiredRole) {
        this.username = username;
        this.password = password;
        this.requiredRole = requiredRole;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRequiredRole() { return requiredRole; }
}
