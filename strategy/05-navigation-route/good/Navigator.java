/**
 * Context — builds routes using whichever RouteStrategy is set.
 * Adding a new transport mode never touches this class.
 */
public class Navigator {

    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy strategy) {
        this.routeStrategy = strategy;
    }

    public void setRouteStrategy(RouteStrategy strategy) {
        this.routeStrategy = strategy;
    }

    public void buildRoute(String origin, String destination) {
        routeStrategy.buildRoute(origin, destination);
    }
}
