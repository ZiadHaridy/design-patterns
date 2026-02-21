public class PepperoniTopping extends ToppingDecorator {

    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Pepperoni";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 3.0;
    }
}
