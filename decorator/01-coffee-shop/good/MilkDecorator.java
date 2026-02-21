/**
 * ConcreteDecorator — adds milk to any Beverage.
 */
public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Milk";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 1.5;
    }
}
