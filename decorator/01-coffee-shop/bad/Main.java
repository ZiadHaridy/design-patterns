/**
 * BAD: We need a separate class for EVERY combination of coffee + toppings.
 *
 * Current classes: Coffee, CoffeeWithMilk, CoffeeWithSugar, CoffeeWithMilkAndSugar
 * What if we add WhippedCream? We'd need:
 *   CoffeeWithWhippedCream, CoffeeWithMilkAndWhippedCream,
 *   CoffeeWithSugarAndWhippedCream, CoffeeWithMilkAndSugarAndWhippedCream
 *
 * This is CLASS EXPLOSION — it doesn't scale.
 */
public class Main {

    public static void main(String[] args) {
        Coffee plain = new Coffee();
        System.out.println(plain.getDescription() + " -> $" + plain.getCost());

        Coffee withMilk = new CoffeeWithMilk();
        System.out.println(withMilk.getDescription() + " -> $" + withMilk.getCost());

        Coffee withSugar = new CoffeeWithSugar();
        System.out.println(withSugar.getDescription() + " -> $" + withSugar.getCost());

        Coffee withBoth = new CoffeeWithMilkAndSugar();
        System.out.println(withBoth.getDescription() + " -> $" + withBoth.getCost());

        System.out.println("\nProblem: 4 classes for just 2 toppings.");
        System.out.println("Adding a 3rd topping would require 8 classes!");
        System.out.println("Adding a 4th would require 16 classes!");
    }
}
