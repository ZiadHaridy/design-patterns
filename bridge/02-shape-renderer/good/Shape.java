/**
 * Abstraction — a shape that delegates drawing to the Renderer bridge.
 */
public abstract class Shape {

    protected final Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
