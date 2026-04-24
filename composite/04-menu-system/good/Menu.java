import java.util.ArrayList;
import java.util.List;

/**
 * Composite — a section of the menu that may contain items and other sections.
 */
public class Menu extends MenuComponent {

    private final List<MenuComponent> children = new ArrayList<>();

    public Menu(String name) {
        super(name);
    }

    public Menu add(MenuComponent child) {
        children.add(child);
        return this;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "+ " + name);
        for (MenuComponent child : children) {
            child.render(indent + "  ");
        }
    }

    @Override
    public double cheapest() {
        double min = Double.POSITIVE_INFINITY;
        for (MenuComponent child : children) {
            min = Math.min(min, child.cheapest());
        }
        return min;
    }
}
