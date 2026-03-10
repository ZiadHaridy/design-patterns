/**
 * GOOD: The client picks the payment strategy at runtime.
 * Adding a new payment method = adding ONE new class, zero changes to OrderService.
 */
public class Main {

    public static void main(String[] args) {
        OrderService service = new OrderService();

        // Pay with credit card
        service.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        service.processPayment(120.00);
        System.out.println();

        // Switch to PayPal at runtime
        service.setPaymentStrategy(new PayPalPayment("user@example.com"));
        service.processPayment(45.50);
        System.out.println();

        // Switch to Crypto
        service.setPaymentStrategy(new CryptoPayment("0xABCD1234"));
        service.processPayment(300.00);

        System.out.println();
        System.out.println("Success: Adding 'BankTransfer' = one new class, no changes to OrderService.");
    }
}
