import java.util.ArrayList;
import java.util.List;

/**
 * Composite — a group of graphics. A group is itself a Graphic,
 * so groups can hold other groups (nesting).
 */
public class ShapeGroup implements Graphic {

    private final String name;
    private final List<Graphic> members = new ArrayList<>();

    public ShapeGroup(String name) {
        this.name = name;
    }

    public ShapeGroup add(Graphic graphic) {
        members.add(graphic);
        return this;
    }

    @Override
    public void draw() {
        System.out.println("Draw Group: " + name);
        for (Graphic g : members) {
            g.draw();
        }
    }

    @Override
    public double area() {
        double total = 0;
        for (Graphic g : members) {
            total += g.area();
        }
        return total;
    }
}
