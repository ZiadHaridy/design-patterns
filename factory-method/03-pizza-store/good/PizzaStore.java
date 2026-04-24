/**
 * Creator — owns the orderPizza() workflow. The factory method
 * createPizza(type) is implemented by each regional store.
 */
public abstract class PizzaStore {

    /** Factory method — each region decides how to make pizzas of a given type. */
    protected abstract Pizza createPizza(String type);

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("Order: " + pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
