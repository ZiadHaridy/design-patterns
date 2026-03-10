/**
 * BAD: A separate class just for coffee + milk.
 */
public class CoffeeWithMilk extends Coffee {

    @Override
    public String getDescription() {
        return "Coffee with Milk";
    }

    @Override
    public double getCost() {
        return 5.0 + 1.5;
    }
}
