/**
 * Context — processes an order using whichever PaymentStrategy is injected.
 * This class never changes when a new payment method is added.
 */
public class OrderService {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        System.out.println("Processing order of $" + amount + "...");
        paymentStrategy.pay(amount);
    }
}
