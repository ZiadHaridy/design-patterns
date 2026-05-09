/**
 * BAD EXAMPLE: A single PizzaStore that hardcodes every regional style
 * inside one orderPizza() method.
 *
 * Problems:
 *  1. Every new region (Chicago, California, Tokyo...) means more if/else.
 *  2. The shared steps (prepare → bake → cut → box) are tangled with
 *     the regional pizza creation.
 *  3. The class has multiple reasons to change — one per region.
 */
public class PizzaStore {

    public void orderPizza(String region, String type) {
        String pizza;

        if (region.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = "NY-style Cheese (thin crust, marinara, parmesan)";
            } else if (type.equals("pepperoni")) {
                pizza = "NY-style Pepperoni (thin crust, marinara, pepperoni)";
            } else throw new IllegalArgumentException(type);
        } else if (region.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza = "Chicago-style Cheese (deep dish, plum tomato, mozzarella)";
            } else if (type.equals("pepperoni")) {
                pizza = "Chicago-style Pepperoni (deep dish, plum tomato, pepperoni)";
            } else throw new IllegalArgumentException(type);
        } else {
            throw new IllegalArgumentException("Unknown region: " + region);
        }

        System.out.println("Order: " + pizza);
        System.out.println("Prepare: " + pizza);
        System.out.println("Bake: " + pizza);
        System.out.println("Cut: " + pizza);
        System.out.println("Box: " + pizza);
    }
}
