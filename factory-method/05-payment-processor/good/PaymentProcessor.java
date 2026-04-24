/**
 * Product — every payment method must validate, charge, and produce a receipt.
 */
public interface PaymentProcessor {

    void validate();

    void charge(double amount);

    void sendReceipt();
}
