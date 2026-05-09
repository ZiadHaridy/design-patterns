/**
 * BAD: Submenus and items are different types. Each operation walks them with instanceof.
 */
public class Main {

    public static void main(String[] args) {
        MenuRenderer.SubMenu root = new MenuRenderer.SubMenu("Main Menu");
        MenuRenderer.SubMenu drinks = new MenuRenderer.SubMenu("Drinks");
        MenuRenderer.SubMenu food = new MenuRenderer.SubMenu("Food");

        root.entries.add(drinks);
        root.entries.add(food);

        drinks.entries.add(new MenuRenderer.MenuItem("Coffee", 3.5));
        drinks.entries.add(new MenuRenderer.MenuItem("Tea", 2.5));

        food.entries.add(new MenuRenderer.MenuItem("Burger", 8.0));
        food.entries.add(new MenuRenderer.MenuItem("Salad", 6.0));

        MenuRenderer renderer = new MenuRenderer();

        System.out.println("=== Menu ===");
        renderer.render(root, "");

        System.out.println("\n=== Cheapest item across whole menu ===");
        System.out.println("$" + renderer.cheapest(root));

        System.out.println("\nProblem: each operation does the same instanceof walk.");
    }
}
