public class Main {
    public static void main(String[] args) {
        Checkout c = new Checkout();

        System.out.println("=== Credit ===");
        c.pay("credit", 49.99);

        System.out.println("\n=== PayPal ===");
        c.pay("paypal", 19.95);

        System.out.println("\nProblem: Checkout knows every payment method.");
    }
}
