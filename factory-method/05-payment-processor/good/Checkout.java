/**
 * Creator — the checkout workflow.
 * Subclasses decide which PaymentProcessor to use.
 */
public abstract class Checkout {

    /** Factory method. */
    protected abstract PaymentProcessor createProcessor();

    public final void pay(double amount) {
        PaymentProcessor processor = createProcessor();
        processor.validate();
        processor.charge(amount);
        processor.sendReceipt();
    }
}
