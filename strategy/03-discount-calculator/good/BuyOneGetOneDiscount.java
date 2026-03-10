/**
 * ConcreteStrategy — buy one get one free (50% off).
 */
public class BuyOneGetOneDiscount implements DiscountStrategy {

    @Override
    public double apply(double price) {
        System.out.println("Applying buy-one-get-one: 50% off.");
        return price * 0.50;
    }
}
