/**
 * GOOD: Decorators let you mix and match toppings at runtime.
 * Adding a new topping = adding ONE class, not 2^N classes.
 */
public class Main {

    public static void main(String[] args) {
        // Plain coffee
        Beverage coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        // Coffee + Milk (wrap with MilkDecorator)
        Beverage coffeeWithMilk = new MilkDecorator(new SimpleCoffee());
        System.out.println(coffeeWithMilk.getDescription() + " -> $" + coffeeWithMilk.getCost());

        // Coffee + Milk + Sugar (stack decorators)
        Beverage coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(coffeeWithMilkAndSugar.getDescription() + " -> $" + coffeeWithMilkAndSugar.getCost());

        // Coffee + Milk + Sugar + Whipped Cream (stack more!)
        Beverage fullyLoaded = new WhippedCreamDecorator(
                new SugarDecorator(
                        new MilkDecorator(new SimpleCoffee())));
        System.out.println(fullyLoaded.getDescription() + " -> $" + fullyLoaded.getCost());

        // Double milk? No problem — just wrap twice!
        Beverage doubleMilk = new MilkDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(doubleMilk.getDescription() + " -> $" + doubleMilk.getCost());

        System.out.println("\nSuccess: 3 decorator classes handle ALL possible combinations.");
        System.out.println("Adding a new topping = adding just 1 new class.");
    }
}
