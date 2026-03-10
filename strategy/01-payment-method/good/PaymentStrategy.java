/**
 * Strategy interface — defines the contract for all payment methods.
 */
public interface PaymentStrategy {

    void pay(double amount);
}
