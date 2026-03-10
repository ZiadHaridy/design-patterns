/**
 * BAD: The payment type is passed as a string.
 * Typos cause runtime errors. Adding a new method means editing OrderService.
 */
public class Main {

    public static void main(String[] args) {
        OrderService service = new OrderService();

        service.processPayment("CREDIT_CARD", 120.00);
        System.out.println();
        service.processPayment("PAYPAL", 45.50);
        System.out.println();
        service.processPayment("CRYPTO", 300.00);

        System.out.println();
        System.out.println("Problem: To add 'BANK_TRANSFER', we must edit OrderService.");
        System.out.println("Every new payment method = modifying existing tested code.");
    }
}
