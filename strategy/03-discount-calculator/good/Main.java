/**
 * GOOD: Discount rules are interchangeable strategies.
 * PercentageDiscount is reusable for any %, no new class needed.
 */
public class Main {

    public static void main(String[] args) {
        double price = 100.0;
        System.out.println("Original price: $" + price);
        System.out.println();

        PriceCalculator calc = new PriceCalculator(new NoDiscount());
        calc.calculate(price);
        System.out.println();

        calc.setDiscountStrategy(new PercentageDiscount(10));
        calc.calculate(price);
        System.out.println();

        calc.setDiscountStrategy(new PercentageDiscount(20));
        calc.calculate(price);
        System.out.println();

        calc.setDiscountStrategy(new FlatDiscount(5));
        calc.calculate(price);
        System.out.println();

        calc.setDiscountStrategy(new BuyOneGetOneDiscount());
        calc.calculate(price);

        System.out.println();
        System.out.println("Success: Adding 'FlashSaleDiscount' = one new class.");
        System.out.println("PercentageDiscount works for ANY %, reused without duplication.");
    }
}
