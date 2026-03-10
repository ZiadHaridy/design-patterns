/**
 * ConcreteStrategy — no discount applied.
 */
public class NoDiscount implements DiscountStrategy {

    @Override
    public double apply(double price) {
        System.out.println("No discount applied.");
        return price;
    }
}
