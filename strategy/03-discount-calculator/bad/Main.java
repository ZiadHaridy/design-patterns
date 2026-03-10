/**
 * BAD: Discount types are magic strings.
 * Every new promotion requires modifying PriceCalculator.
 */
public class Main {

    public static void main(String[] args) {
        PriceCalculator calc = new PriceCalculator();
        double price = 100.0;

        System.out.println("Original price: $" + price);
        System.out.println("No discount:    $" + calc.calculate(price, "NONE"));
        System.out.println("10% off:        $" + calc.calculate(price, "PERCENTAGE_10"));
        System.out.println("20% off:        $" + calc.calculate(price, "PERCENTAGE_20"));
        System.out.println("Flat $5 off:    $" + calc.calculate(price, "FLAT_5"));
        System.out.println("BOGO:           $" + calc.calculate(price, "BUY_ONE_GET_ONE"));

        System.out.println("\nProblem: Adding a 'FLASH_SALE' discount = editing PriceCalculator.");
    }
}
