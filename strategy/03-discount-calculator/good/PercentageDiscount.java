/**
 * ConcreteStrategy — applies a percentage discount.
 * Reusable for any percentage (10%, 20%, 50%, etc.).
 */
public class PercentageDiscount implements DiscountStrategy {

    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double price) {
        double discount = price * (percentage / 100);
        System.out.println("Applying " + percentage + "% discount: -$" + discount);
        return price - discount;
    }
}
