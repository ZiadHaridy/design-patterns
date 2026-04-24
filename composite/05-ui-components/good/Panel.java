/**
 * Composite — a Panel container.
 */
public class Panel extends Container {

    public Panel(String title) {
        super(title);
    }

    @Override
    protected String kind() {
        return "Panel";
    }
}
