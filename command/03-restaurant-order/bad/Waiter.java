/**
 * BAD: Waiter calls the kitchen directly. Adding a new kitchen role
 * (Pastry Chef, Sommelier) requires editing Waiter.
 */
public class Waiter {

    private final Cook cook = new Cook();

    public void takeOrder(String item) {
        System.out.println("[Waiter] ordering: " + item);
        cook.prepare(item);
    }
}
