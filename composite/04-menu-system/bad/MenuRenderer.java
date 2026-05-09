import java.util.ArrayList;
import java.util.List;

/**
 * BAD EXAMPLE: A restaurant menu where MenuItem and SubMenu are
 * unrelated types, and a renderer hand-walks the tree with instanceof.
 *
 * Problems:
 *  1. Rendering and price-summing duplicate the same structural recursion.
 *  2. Adding a "Combo" or "Special Section" type means editing every method.
 *  3. The client has to track which type it is dealing with.
 */
public class MenuRenderer {

    public static class MenuItem {
        public String name;
        public double price;
        public MenuItem(String name, double price) { this.name = name; this.price = price; }
    }

    public static class SubMenu {
        public String name;
        public List<Object> entries = new ArrayList<>(); // MenuItem or SubMenu
        public SubMenu(String name) { this.name = name; }
    }

    public void render(Object node, String indent) {
        if (node instanceof MenuItem) {
            MenuItem m = (MenuItem) node;
            System.out.println(indent + "- " + m.name + " ($" + m.price + ")");
        } else if (node instanceof SubMenu) {
            SubMenu s = (SubMenu) node;
            System.out.println(indent + "+ " + s.name);
            for (Object entry : s.entries) render(entry, indent + "  ");
        }
    }

    public double cheapest(Object node) {
        if (node instanceof MenuItem) {
            return ((MenuItem) node).price;
        } else if (node instanceof SubMenu) {
            double min = Double.POSITIVE_INFINITY;
            for (Object entry : ((SubMenu) node).entries) {
                min = Math.min(min, cheapest(entry));
            }
            return min;
        }
        throw new IllegalArgumentException("Unknown menu node");
    }
}
