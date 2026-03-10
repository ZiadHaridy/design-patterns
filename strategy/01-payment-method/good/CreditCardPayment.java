/**
 * ConcreteStrategy — credit card payment logic.
 */
public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Validating credit card: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Charging $" + amount + " to credit card.");
        System.out.println("Sending credit card receipt.");
    }
}
