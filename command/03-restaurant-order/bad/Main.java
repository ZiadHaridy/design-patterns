public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.takeOrder("Steak");
        waiter.takeOrder("Salad");

        System.out.println("\nProblem: orders can't be queued or cancelled.");
        System.out.println("Waiter fires immediately — no way to batch to the kitchen.");
    }
}
