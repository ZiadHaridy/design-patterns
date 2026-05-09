public class PayPalProcessor implements PaymentProcessor {

    @Override
    public void validate() {
        System.out.println("Validate PayPal session for user@example.com");
    }

    @Override
    public void charge(double amount) {
        System.out.println("Charge $" + amount + " via PayPal");
    }

    @Override
    public void sendReceipt() {
        System.out.println("Email receipt for PayPal payment");
    }
}
