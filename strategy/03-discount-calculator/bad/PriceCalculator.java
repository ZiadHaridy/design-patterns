/**
 * BAD EXAMPLE: Discount logic buried in if/else inside the calculator.
 *
 * Problems:
 *  1. Adding a new discount type (e.g., "FLASH_SALE") requires editing this class.
 *  2. Business rules are mixed with calculation logic.
 *  3. Hard to add discounts that stack or have complex conditions.
 */
public class PriceCalculator {

    public double calculate(double price, String discountType) {
        if (discountType.equals("NONE")) {
            return price;

        } else if (discountType.equals("PERCENTAGE_10")) {
            double discount = price * 0.10;
            System.out.println("Applying 10% discount: -$" + discount);
            return price - discount;

        } else if (discountType.equals("PERCENTAGE_20")) {
            double discount = price * 0.20;
            System.out.println("Applying 20% discount: -$" + discount);
            return price - discount;

        } else if (discountType.equals("FLAT_5")) {
            System.out.println("Applying flat $5 discount.");
            return Math.max(0, price - 5.0);

        } else if (discountType.equals("BUY_ONE_GET_ONE")) {
            System.out.println("Applying buy-one-get-one: 50% off.");
            return price * 0.50;

        } else {
            throw new IllegalArgumentException("Unknown discount: " + discountType);
        }
    }
}
