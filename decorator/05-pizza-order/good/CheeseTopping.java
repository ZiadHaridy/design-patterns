public class CheeseTopping extends ToppingDecorator {

    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Cheese";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 2.0;
    }
}
