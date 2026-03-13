/**
 * ConcreteHandler — checks rate limiting.
 * Easy to add/remove from the chain without touching other handlers.
 */
public class RateLimitHandler extends AuthHandler {

    @Override
    public boolean handle(AuthRequest request) {
        System.out.println("PASS: Rate limit OK for '" + request.getUsername() + "'.");
        return super.handle(request);
    }
}
