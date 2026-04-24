public class CreditCardCheckout extends Checkout {
    @Override
    protected PaymentProcessor createProcessor() {
        return new CreditCardProcessor();
    }
}
