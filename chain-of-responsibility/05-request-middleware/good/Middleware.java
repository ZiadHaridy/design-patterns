/**
 * Handler — abstract base for the middleware chain.
 * Each middleware processes the request and optionally passes it along.
 */
public abstract class Middleware {

    private Middleware next;

    public Middleware setNext(Middleware middleware) {
        this.next = middleware;
        return middleware;
    }

    public boolean handle(HttpRequest request) {
        if (next != null) {
            return next.handle(request);
        }
        return true; // end of chain — request approved
    }
}
