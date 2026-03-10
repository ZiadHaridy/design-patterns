/**
 * Context — calculates final price using the injected DiscountStrategy.
 * Never changes when new discount types are added.
 */
public class PriceCalculator {

    private DiscountStrategy discountStrategy;

    public PriceCalculator(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    public double calculate(double price) {
        double finalPrice = discountStrategy.apply(price);
        System.out.printf("Final price: $%.2f%n", finalPrice);
        return finalPrice;
    }
}
