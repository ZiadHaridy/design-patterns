public class SubscriptionOrder extends Order {

    public SubscriptionOrder(double amount, PaymentGateway gateway) {
        super(amount, gateway);
    }

    @Override
    public void checkout() {
        gateway.charge(amount, "monthly subscription");
    }
}
