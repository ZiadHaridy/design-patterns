/**
 * ConcreteCreator — NY-style branch.
 */
public class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese"    -> new NyCheesePizza();
            case "pepperoni" -> new NyPepperoniPizza();
            default -> throw new IllegalArgumentException("NY store doesn't make: " + type);
        };
    }
}
