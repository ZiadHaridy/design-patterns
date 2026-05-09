/**
 * Leaf — a static text label.
 */
public class Label implements UIComponent {

    private final String text;

    public Label(String text) {
        this.text = text;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "[Label: " + text + "]");
    }
}
