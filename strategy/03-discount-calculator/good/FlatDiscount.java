/**
 * ConcreteStrategy — applies a fixed flat amount discount.
 */
public class FlatDiscount implements DiscountStrategy {

    private double amount;

    public FlatDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double apply(double price) {
        System.out.println("Applying flat $" + amount + " discount.");
        return Math.max(0, price - amount);
    }
}
