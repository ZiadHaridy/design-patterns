/**
 * GOOD: Build pizza orders by stacking topping decorators.
 * Adding a new topping = adding ONE class, no modifications needed.
 */
public class Main {

    public static void main(String[] args) {
        // Plain pizza
        Pizza plain = new PlainPizza();
        System.out.println(plain.getDescription() + " -> $" + plain.getCost());

        // Pizza + Cheese
        Pizza cheesy = new CheeseTopping(new PlainPizza());
        System.out.println(cheesy.getDescription() + " -> $" + cheesy.getCost());

        // Pizza + Cheese + Pepperoni + Mushrooms
        Pizza loaded = new MushroomTopping(
                new PepperoniTopping(
                        new CheeseTopping(new PlainPizza())));
        System.out.println(loaded.getDescription() + " -> $" + loaded.getCost());

        // Extra cheese? Wrap it twice!
        Pizza extraCheese = new CheeseTopping(
                new CheeseTopping(new PlainPizza()));
        System.out.println(extraCheese.getDescription() + " -> $" + extraCheese.getCost());

        System.out.println("\nSuccess: Each topping is a separate class.");
        System.out.println("New toppings don't require modifying PlainPizza (Open/Closed Principle).");
        System.out.println("Double toppings work naturally by wrapping twice.");
    }
}
