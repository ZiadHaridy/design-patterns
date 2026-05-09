import java.util.ArrayList;
import java.util.List;

/**
 * Invoker — takes orders and fires them to the kitchen as a batch.
 */
public class Waiter {

    private final List<Order> orderSlip = new ArrayList<>();

    public void addOrder(Order order) {
        System.out.println("[Waiter] noted order");
        orderSlip.add(order);
    }

    public void sendOrdersToKitchen() {
        System.out.println("[Waiter] sending slip to kitchen...");
        for (Order o : orderSlip) {
            o.execute();
        }
        orderSlip.clear();
    }

    public void cancelOrders() {
        System.out.println("[Waiter] all orders cancelled");
        orderSlip.clear();
    }
}
