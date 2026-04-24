/**
 * GOOD: PizzaStore.orderPizza() is the same everywhere.
 * Each region overrides createPizza() to choose its concrete pizzas.
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore ny = new NyPizzaStore();
        PizzaStore chicago = new ChicagoPizzaStore();

        System.out.println("=== NY cheese ===");
        ny.orderPizza("cheese");

        System.out.println("\n=== Chicago pepperoni ===");
        chicago.orderPizza("pepperoni");

        System.out.println("\nSuccess: orderPizza() workflow doesn't change.");
        System.out.println("Adding California or Tokyo store = 1 new PizzaStore subclass + the new Pizza classes.");
    }
}
