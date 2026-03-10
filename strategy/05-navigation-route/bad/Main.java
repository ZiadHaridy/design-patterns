/**
 * BAD: Mode is a string, and the navigator must be called differently for each.
 * Can't switch modes on an existing navigator instance.
 */
public class Main {

    public static void main(String[] args) {
        Navigator nav = new Navigator();

        nav.buildRoute("Home", "Office", "DRIVING");
        System.out.println();
        nav.buildRoute("Home", "Office", "WALKING");
        System.out.println();
        nav.buildRoute("Home", "Office", "PUBLIC_TRANSPORT");

        System.out.println();
        System.out.println("Problem: Adding 'CYCLING' = editing Navigator class.");
    }
}
