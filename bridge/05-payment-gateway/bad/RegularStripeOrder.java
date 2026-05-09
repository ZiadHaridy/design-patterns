public class RegularStripeOrder {
    private final double amount;
    public RegularStripeOrder(double amount) { this.amount = amount; }
    public void checkout() {
        System.out.println("Regular order: one-time charge $" + amount + " via Stripe");
    }
}
