/**
 * BAD: Yet another class for coffee + sugar.
 */
public class CoffeeWithSugar extends Coffee {

    @Override
    public String getDescription() {
        return "Coffee with Sugar";
    }

    @Override
    public double getCost() {
        return 5.0 + 0.5;
    }
}
