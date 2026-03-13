/**
 * Handler — abstract base for auth chain.
 * Each handler either passes the request or rejects it.
 */
public abstract class AuthHandler {

    private AuthHandler next;

    public AuthHandler setNext(AuthHandler handler) {
        this.next = handler;
        return handler;
    }

    public boolean handle(AuthRequest request) {
        if (next != null) {
            return next.handle(request);
        }
        // End of chain — all checks passed
        return true;
    }
}
