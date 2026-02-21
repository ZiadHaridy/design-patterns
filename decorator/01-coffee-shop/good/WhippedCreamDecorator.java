/**
 * ConcreteDecorator — adds whipped cream to any Beverage.
 * Adding a new topping = adding ONE class. No explosion!
 */
public class WhippedCreamDecorator extends BeverageDecorator {

    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Whipped Cream";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 2.0;
    }
}
