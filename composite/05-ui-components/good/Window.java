/**
 * Composite — a top-level Window container.
 */
public class Window extends Container {

    public Window(String title) {
        super(title);
    }

    @Override
    protected String kind() {
        return "Window";
    }
}
