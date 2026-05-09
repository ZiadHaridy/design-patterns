/**
 * Component — anything that can appear in the menu tree.
 */
public abstract class MenuComponent {

    protected final String name;

    protected MenuComponent(String name) {
        this.name = name;
    }

    public abstract void render(String indent);

    public abstract double cheapest();
}
