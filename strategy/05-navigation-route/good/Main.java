/**
 * GOOD: User can switch transport modes at runtime.
 * CyclingRoute was added without touching Navigator.
 */
public class Main {

    public static void main(String[] args) {
        Navigator nav = new Navigator(new DrivingRoute());
        nav.buildRoute("Home", "Office");
        System.out.println();

        // User switches to walking mode
        nav.setRouteStrategy(new WalkingRoute());
        nav.buildRoute("Home", "Office");
        System.out.println();

        // User switches to public transport
        nav.setRouteStrategy(new PublicTransportRoute());
        nav.buildRoute("Home", "Office");
        System.out.println();

        // Cycling was added without modifying Navigator!
        nav.setRouteStrategy(new CyclingRoute());
        nav.buildRoute("Home", "Office");

        System.out.println();
        System.out.println("Success: CyclingRoute added with zero changes to Navigator.");
    }
}
