public class Circle extends Shape {

    private final int x, y, radius;

    public Circle(int x, int y, int radius, Renderer renderer) {
        super(renderer);
        this.x = x; this.y = y; this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(x, y, radius);
    }
}
