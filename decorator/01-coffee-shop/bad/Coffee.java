/**
 * BAD EXAMPLE: Using inheritance for every coffee + topping combination.
 *
 * Problem: Class explosion!
 * For 3 base coffees and 3 toppings, you'd need 3 × 2^3 = 24 classes
 * to cover every possible combination.
 */
public class Coffee {

    public String getDescription() {
        return "Simple Coffee";
    }

    public double getCost() {
        return 5.0;
    }
}
