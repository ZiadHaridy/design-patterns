/**
 * BAD: Adding a new region forces editing PizzaStore.orderPizza().
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        System.out.println("=== NY cheese ===");
        store.orderPizza("NY", "cheese");

        System.out.println("\n=== Chicago pepperoni ===");
        store.orderPizza("Chicago", "pepperoni");

        System.out.println("\nProblem: regional logic + workflow live in the same method.");
    }
}
