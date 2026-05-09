public class RegularOrder extends Order {

    public RegularOrder(double amount, PaymentGateway gateway) {
        super(amount, gateway);
    }

    @Override
    public void checkout() {
        gateway.charge(amount, "one-time purchase");
    }
}
