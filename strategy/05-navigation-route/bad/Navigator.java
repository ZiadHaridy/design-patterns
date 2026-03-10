/**
 * BAD EXAMPLE: Routing mode chosen via if/else inside the navigator.
 *
 * Problems:
 *  1. Adding a new mode (e.g., "CYCLING") requires editing this class.
 *  2. Route calculation logic is tangled with navigation logic.
 *  3. Can't let the user switch modes on a live Navigator.
 */
public class Navigator {

    public void buildRoute(String origin, String destination, String mode) {
        if (mode.equals("DRIVING")) {
            System.out.println("Calculating fastest driving route...");
            System.out.println("Using highways and main roads.");
            System.out.println("Avoiding toll roads: false");
            System.out.println("Route: " + origin + " → [Highway A1] → " + destination);
            System.out.println("Estimated time: 35 min");

        } else if (mode.equals("WALKING")) {
            System.out.println("Calculating walking route...");
            System.out.println("Preferring pedestrian paths and shortcuts.");
            System.out.println("Route: " + origin + " → [Park Path] → " + destination);
            System.out.println("Estimated time: 22 min");

        } else if (mode.equals("PUBLIC_TRANSPORT")) {
            System.out.println("Checking public transport schedules...");
            System.out.println("Finding nearest bus/metro stops.");
            System.out.println("Route: " + origin + " → [Bus 42] → [Metro M1] → " + destination);
            System.out.println("Estimated time: 50 min");

        } else {
            throw new IllegalArgumentException("Unknown mode: " + mode);
        }
    }
}
