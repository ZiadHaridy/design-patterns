/**
 * BAD EXAMPLE: One Dealership class hardcodes every vehicle type.
 *
 * Problems:
 *  1. Adding Truck or Motorcycle means editing this method.
 *  2. The "deliver vehicle" workflow is tangled with the creation.
 *  3. Specs of every vehicle live inside Dealership.
 */
public class Dealership {

    public void deliver(String type) {
        String vehicle;

        if (type.equals("car")) {
            vehicle = "Sedan (4 doors, 5 seats, gasoline)";
        } else if (type.equals("truck")) {
            vehicle = "Pickup Truck (2 doors, 3 seats, diesel)";
        } else if (type.equals("motorcycle")) {
            vehicle = "Motorcycle (2 wheels, 1 seat, gasoline)";
        } else {
            throw new IllegalArgumentException("Unknown vehicle: " + type);
        }

        System.out.println("Build:    " + vehicle);
        System.out.println("Inspect:  " + vehicle);
        System.out.println("Register: " + vehicle);
        System.out.println("Deliver:  " + vehicle);
    }
}
