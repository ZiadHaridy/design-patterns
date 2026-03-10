/**
 * ConcreteStrategy — calculates the best cycling route.
 * Adding this required ZERO changes to Navigator.
 */
public class CyclingRoute implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Calculating cycling route...");
        System.out.println("Preferring bike lanes and low-traffic roads.");
        System.out.println("Route: " + origin + " → [Bike Lane B3] → " + destination);
        System.out.println("Estimated time: 18 min");
    }
}
