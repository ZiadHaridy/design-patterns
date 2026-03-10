/**
 * ConcreteStrategy — cryptocurrency payment logic.
 */
public class CryptoPayment implements PaymentStrategy {

    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Generating crypto deposit to wallet: " + walletAddress);
        System.out.println("Waiting for $" + amount + " blockchain confirmation.");
        System.out.println("Transaction recorded on blockchain.");
    }
}
