/**
 * ConcreteComponent — the base coffee with no add-ons.
 */
public class SimpleCoffee implements Beverage {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
