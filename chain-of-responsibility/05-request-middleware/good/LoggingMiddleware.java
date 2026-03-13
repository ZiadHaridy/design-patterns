/**
 * ConcreteHandler — logs the request and always passes to the next.
 */
public class LoggingMiddleware extends Middleware {

    @Override
    public boolean handle(HttpRequest request) {
        System.out.println("[LOG] " + request.getIp() + " -> " + request.getPath());
        return super.handle(request);
    }
}
