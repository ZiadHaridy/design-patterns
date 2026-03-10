/**
 * ConcreteStrategy — calculates the best public transport route.
 */
public class PublicTransportRoute implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Checking public transport schedules...");
        System.out.println("Finding nearest bus/metro stops.");
        System.out.println("Route: " + origin + " → [Bus 42] → [Metro M1] → " + destination);
        System.out.println("Estimated time: 50 min");
    }
}
