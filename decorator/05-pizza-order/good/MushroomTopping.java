public class MushroomTopping extends ToppingDecorator {

    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Mushrooms";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 1.5;
    }
}
