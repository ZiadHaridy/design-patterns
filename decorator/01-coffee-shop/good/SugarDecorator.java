/**
 * ConcreteDecorator — adds sugar to any Beverage.
 */
public class SugarDecorator extends BeverageDecorator {

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Sugar";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 0.5;
    }
}
