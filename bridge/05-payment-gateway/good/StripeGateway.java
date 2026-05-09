public class StripeGateway implements PaymentGateway {
    @Override
    public void charge(double amount, String description) {
        System.out.println("[Stripe] charge $" + amount + " — " + description);
    }
}
