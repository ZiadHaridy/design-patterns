public class PayPalCheckout extends Checkout {
    @Override
    protected PaymentProcessor createProcessor() {
        return new PayPalProcessor();
    }
}
