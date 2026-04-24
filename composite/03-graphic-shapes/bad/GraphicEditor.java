import java.util.ArrayList;
import java.util.List;

/**
 * BAD EXAMPLE: A vector editor where a "group" of shapes is a wholly
 * different type from a "shape". Operations like draw and computeBoundingArea
 * have to switch on the type.
 *
 * Problems:
 *  1. Drawing a single shape and drawing a group go through different code paths.
 *  2. Nesting (group inside group) requires nested instanceof recursion.
 *  3. Adding a new shape (e.g. Polygon) means editing every dispatch method.
 */
public class GraphicEditor {

    public static class Circle {
        public int x, y, radius;
        public Circle(int x, int y, int r) { this.x = x; this.y = y; this.radius = r; }
    }

    public static class Rectangle {
        public int x, y, width, height;
        public Rectangle(int x, int y, int w, int h) { this.x = x; this.y = y; this.width = w; this.height = h; }
    }

    public static class Group {
        public String name;
        public List<Object> members = new ArrayList<>(); // Circle, Rectangle, or Group
        public Group(String name) { this.name = name; }
    }

    public void draw(Object shape) {
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            System.out.println("Draw Circle at (" + c.x + "," + c.y + ") r=" + c.radius);
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            System.out.println("Draw Rectangle at (" + r.x + "," + r.y + ") " + r.width + "x" + r.height);
        } else if (shape instanceof Group) {
            Group g = (Group) shape;
            System.out.println("Draw Group: " + g.name);
            for (Object m : g.members) draw(m);
        }
    }

    public double area(Object shape) {
        if (shape instanceof Circle) {
            int r = ((Circle) shape).radius;
            return Math.PI * r * r;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.width * r.height;
        } else if (shape instanceof Group) {
            double total = 0;
            for (Object m : ((Group) shape).members) total += area(m);
            return total;
        }
        throw new IllegalArgumentException("Unknown shape");
    }
}
