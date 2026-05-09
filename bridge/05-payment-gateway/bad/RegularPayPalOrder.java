public class RegularPayPalOrder {
    private final double amount;
    public RegularPayPalOrder(double amount) { this.amount = amount; }
    public void checkout() {
        System.out.println("Regular order: one-time charge $" + amount + " via PayPal");
    }
}
