public class SubscriptionPayPalOrder {
    private final double amount;
    public SubscriptionPayPalOrder(double amount) { this.amount = amount; }
    public void checkout() {
        System.out.println("Subscription: recurring $" + amount + "/month via PayPal");
    }
}
