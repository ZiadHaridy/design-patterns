/** Abstraction — an order type, delegates payment to the gateway bridge. */
public abstract class Order {

    protected final PaymentGateway gateway;
    protected final double amount;

    protected Order(double amount, PaymentGateway gateway) {
        this.amount = amount;
        this.gateway = gateway;
    }

    public abstract void checkout();
}
