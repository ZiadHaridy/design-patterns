/**
 * ConcreteCreator — Chicago-style branch.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese"    -> new ChicagoCheesePizza();
            case "pepperoni" -> new ChicagoPepperoniPizza();
            default -> throw new IllegalArgumentException("Chicago store doesn't make: " + type);
        };
    }
}
