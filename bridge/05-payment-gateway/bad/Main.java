/**
 * BAD: RegularOrder/SubscriptionOrder × PayPal/Stripe = 4 combo classes.
 */
public class Main {
    public static void main(String[] args) {
        new RegularPayPalOrder(59.99).checkout();
        new RegularStripeOrder(59.99).checkout();
        new SubscriptionPayPalOrder(9.99).checkout();
        new SubscriptionStripeOrder(9.99).checkout();

        System.out.println("\nProblem: adding CryptoGateway = 2 new classes.");
    }
}
