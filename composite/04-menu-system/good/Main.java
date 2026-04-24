/**
 * GOOD: Items and submenus share MenuComponent.
 * Submenus inside submenus work without any extra code.
 */
public class Main {

    public static void main(String[] args) {
        Menu root = new Menu("Main Menu");

        Menu drinks = new Menu("Drinks")
            .add(new MenuItem("Coffee", 3.5))
            .add(new MenuItem("Tea", 2.5));

        Menu hot = new Menu("Hot")
            .add(new MenuItem("Espresso", 3.0))
            .add(new MenuItem("Cappuccino", 4.0));
        drinks.add(hot); // nested submenu

        Menu food = new Menu("Food")
            .add(new MenuItem("Burger", 8.0))
            .add(new MenuItem("Salad", 6.0));

        root.add(drinks).add(food);

        System.out.println("=== Menu ===");
        root.render("");

        System.out.println("\n=== Cheapest item anywhere on the menu ===");
        System.out.println("$" + root.cheapest());

        System.out.println("\nSuccess: nested menus work for free. No instanceof.");
    }
}
