public class PayPalGateway implements PaymentGateway {
    @Override
    public void charge(double amount, String description) {
        System.out.println("[PayPal] charge $" + amount + " — " + description);
    }
}
