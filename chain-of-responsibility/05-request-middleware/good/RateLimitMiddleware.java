import java.util.Set;

/**
 * ConcreteHandler — blocks requests from rate-limited IPs.
 */
public class RateLimitMiddleware extends Middleware {

    private Set<String> blockedIps = Set.of("192.168.1.100");

    @Override
    public boolean handle(HttpRequest request) {
        if (blockedIps.contains(request.getIp())) {
            System.out.println("[RATE LIMIT] IP " + request.getIp() + " is blocked.");
            return false;
        }
        System.out.println("[RATE LIMIT] OK");
        return super.handle(request);
    }
}
