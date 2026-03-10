/**
 * ConcreteStrategy — calculates the fastest driving route.
 */
public class DrivingRoute implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Calculating fastest driving route...");
        System.out.println("Using highways and main roads.");
        System.out.println("Route: " + origin + " → [Highway A1] → " + destination);
        System.out.println("Estimated time: 35 min");
    }
}
