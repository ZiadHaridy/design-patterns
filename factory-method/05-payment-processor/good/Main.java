/**
 * GOOD: Checkout.pay() doesn't know what payment method runs underneath.
 * Add ApplePay = 1 PaymentProcessor + 1 Checkout subclass.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Credit ===");
        new CreditCardCheckout().pay(49.99);

        System.out.println("\n=== PayPal ===");
        new PayPalCheckout().pay(19.95);

        System.out.println("\nSuccess: pay() workflow is fixed; products are pluggable.");
    }
}
