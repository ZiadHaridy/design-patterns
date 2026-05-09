public class SubscriptionStripeOrder {
    private final double amount;
    public SubscriptionStripeOrder(double amount) { this.amount = amount; }
    public void checkout() {
        System.out.println("Subscription: recurring $" + amount + "/month via Stripe");
    }
}
