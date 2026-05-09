public class Main {
    public static void main(String[] args) {
        Dealership d = new Dealership();

        System.out.println("=== Car ===");
        d.deliver("car");

        System.out.println("\n=== Truck ===");
        d.deliver("truck");

        System.out.println("\nProblem: every new model edits Dealership.deliver().");
    }
}
