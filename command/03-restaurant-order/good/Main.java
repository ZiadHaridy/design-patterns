/**
 * GOOD: Waiter collects commands (orders) and sends them as a batch.
 * Orders can be cancelled before being fired.
 */
public class Main {

    public static void main(String[] args) {
        Cook cook   = new Cook();
        Waiter waiter = new Waiter();

        waiter.addOrder(new MealOrder(cook, "Steak"));
        waiter.addOrder(new DrinkOrder(cook, "Red Wine"));
        waiter.addOrder(new MealOrder(cook, "Salad"));

        waiter.sendOrdersToKitchen();

        System.out.println();

        waiter.addOrder(new MealOrder(cook, "Dessert"));
        waiter.cancelOrders();  // changed mind before the kitchen received it

        System.out.println("\nSuccess: waiter queues commands, kitchen never gets cancelled orders.");
    }
}
