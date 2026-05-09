/**
 * GOOD: One workflow in Dealership.deliver().
 * Each dealership subclass picks its vehicle.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Car ===");
        new CarDealership().deliver();

        System.out.println("\n=== Truck ===");
        new TruckDealership().deliver();

        System.out.println("\n=== Motorcycle ===");
        new MotorcycleDealership().deliver();

        System.out.println("\nSuccess: deliver() never changes when adding new vehicle types.");
    }
}
