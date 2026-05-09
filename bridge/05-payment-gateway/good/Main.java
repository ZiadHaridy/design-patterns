public class Main {

    public static void main(String[] args) {
        PaymentGateway paypal = new PayPalGateway();
        PaymentGateway stripe = new StripeGateway();

        new RegularOrder(59.99, paypal).checkout();
        new RegularOrder(59.99, stripe).checkout();
        new SubscriptionOrder(9.99, paypal).checkout();
        new SubscriptionOrder(9.99, stripe).checkout();

        System.out.println("\nSuccess: 2 order types + 2 gateways = 4 classes, not 4 combo classes.");
        System.out.println("Adding CryptoGateway = 1 class.");
    }
}
