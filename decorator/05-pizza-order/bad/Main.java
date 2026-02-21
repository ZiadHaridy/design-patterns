/**
 * BAD: Toppings are managed via boolean flags.
 * Adding a new topping means modifying the Pizza class.
 */
public class Main {

    public static void main(String[] args) {
        Pizza plain = new Pizza(false, false, false, false);
        System.out.println(plain.getDescription() + " -> $" + plain.getCost());

        Pizza cheesy = new Pizza(true, false, false, false);
        System.out.println(cheesy.getDescription() + " -> $" + cheesy.getCost());

        Pizza loaded = new Pizza(true, true, true, true);
        System.out.println(loaded.getDescription() + " -> $" + loaded.getCost());

        System.out.println("\nProblem: Adding a new topping (e.g., Jalapenos) requires");
        System.out.println("modifying the Pizza class — violates Open/Closed Principle.");
        System.out.println("Also can't order 'extra cheese' (double topping).");
    }
}
