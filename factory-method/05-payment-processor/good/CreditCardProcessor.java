public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void validate() {
        System.out.println("Validate credit card 4111-...-1234");
    }

    @Override
    public void charge(double amount) {
        System.out.println("Charge $" + amount + " via Visa");
    }

    @Override
    public void sendReceipt() {
        System.out.println("Email receipt for credit card payment");
    }
}
