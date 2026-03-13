/**
 * ConcreteHandler — validates the authentication token.
 */
public class AuthMiddleware extends Middleware {

    @Override
    public boolean handle(HttpRequest request) {
        if (request.getToken() == null || !request.getToken().equals("valid-token-123")) {
            System.out.println("[AUTH] Invalid token. Request rejected.");
            return false;
        }
        System.out.println("[AUTH] Token validated.");
        return super.handle(request);
    }
}
