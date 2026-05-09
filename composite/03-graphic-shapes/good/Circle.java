/**
 * Leaf — a circle.
 */
public class Circle implements Graphic {

    private final int x;
    private final int y;
    private final int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle at (" + x + "," + y + ") r=" + radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
