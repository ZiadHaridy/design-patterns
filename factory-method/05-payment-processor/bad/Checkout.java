/**
 * BAD EXAMPLE: A Checkout class that decides which payment processor
 * to use AND knows how each one works.
 *
 * Problems:
 *  1. Every new payment method (Crypto, ApplePay) means editing this class.
 *  2. The validate → charge → receipt workflow is duplicated in each branch.
 *  3. Concrete processor logic is scattered through Checkout.
 */
public class Checkout {

    public void pay(String method, double amount) {
        if (method.equals("credit")) {
            System.out.println("Validate credit card 4111-...-1234");
            System.out.println("Charge $" + amount + " via Visa");
            System.out.println("Email receipt for credit card payment");
        } else if (method.equals("paypal")) {
            System.out.println("Validate PayPal session for user@example.com");
            System.out.println("Charge $" + amount + " via PayPal");
            System.out.println("Email receipt for PayPal payment");
        } else {
            throw new IllegalArgumentException("Unknown method: " + method);
        }
    }
}
