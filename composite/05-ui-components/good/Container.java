import java.util.ArrayList;
import java.util.List;

/**
 * Composite — any container that holds child UIComponents.
 * Window and Panel are different containers but share the same composite logic.
 */
public abstract class Container implements UIComponent {

    protected final String title;
    protected final List<UIComponent> children = new ArrayList<>();

    protected Container(String title) {
        this.title = title;
    }

    public Container add(UIComponent child) {
        children.add(child);
        return this;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + kind() + "(" + title + ") {");
        for (UIComponent child : children) {
            child.render(indent + "  ");
        }
        System.out.println(indent + "}");
    }

    protected abstract String kind();
}
