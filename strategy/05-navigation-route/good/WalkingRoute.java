/**
 * ConcreteStrategy — calculates the best walking route.
 */
public class WalkingRoute implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Calculating walking route...");
        System.out.println("Preferring pedestrian paths and shortcuts.");
        System.out.println("Route: " + origin + " → [Park Path] → " + destination);
        System.out.println("Estimated time: 22 min");
    }
}
