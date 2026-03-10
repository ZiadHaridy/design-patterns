/**
 * BAD EXAMPLE: Payment logic hardcoded with if/else inside the service.
 *
 * Problems:
 *  1. Adding a new payment method (e.g., Crypto) requires modifying this class.
 *  2. The class violates the Open/Closed Principle.
 *  3. The method grows longer with every new payment type.
 *  4. Each branch is hard to test in isolation.
 */
public class OrderService {

    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CREDIT_CARD")) {
            System.out.println("Validating credit card details...");
            System.out.println("Charging $" + amount + " to credit card.");
            System.out.println("Sending credit card receipt.");

        } else if (paymentType.equals("PAYPAL")) {
            System.out.println("Redirecting to PayPal login...");
            System.out.println("Charging $" + amount + " via PayPal.");
            System.out.println("Sending PayPal confirmation email.");

        } else if (paymentType.equals("CRYPTO")) {
            System.out.println("Generating crypto wallet address...");
            System.out.println("Waiting for $" + amount + " blockchain confirmation.");
            System.out.println("Transaction recorded on blockchain.");

        } else {
            throw new IllegalArgumentException("Unknown payment type: " + paymentType);
        }
    }
}
