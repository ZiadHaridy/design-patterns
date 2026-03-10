/**
 * BAD: Another class for coffee + milk + sugar.
 * Imagine adding WhippedCream, Caramel, Vanilla...
 * The number of classes grows exponentially!
 */
public class CoffeeWithMilkAndSugar extends Coffee {

    @Override
    public String getDescription() {
        return "Coffee with Milk and Sugar";
    }

    @Override
    public double getCost() {
        return 5.0 + 1.5 + 0.5;
    }
}
