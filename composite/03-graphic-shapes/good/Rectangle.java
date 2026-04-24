/**
 * Leaf — an axis-aligned rectangle.
 */
public class Rectangle implements Graphic {

    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle at (" + x + "," + y + ") " + width + "x" + height);
    }

    @Override
    public double area() {
        return width * height;
    }
}
