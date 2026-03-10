/**
 * ConcreteStrategy — PayPal payment logic.
 */
public class PayPalPayment implements PaymentStrategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Redirecting to PayPal login for: " + email);
        System.out.println("Charging $" + amount + " via PayPal.");
        System.out.println("Sending PayPal confirmation email.");
    }
}
