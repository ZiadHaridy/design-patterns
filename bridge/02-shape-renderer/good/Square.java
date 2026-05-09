public class Square extends Shape {

    private final int x, y, side;

    public Square(int x, int y, int side, Renderer renderer) {
        super(renderer);
        this.x = x; this.y = y; this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(x, y, side);
    }
}
