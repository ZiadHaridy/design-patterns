/**
 * Leaf — a concrete dish with a price.
 */
public class MenuItem extends MenuComponent {

    private final double price;

    public MenuItem(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "- " + name + " ($" + price + ")");
    }

    @Override
    public double cheapest() {
        return price;
    }
}
