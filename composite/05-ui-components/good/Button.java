/**
 * Leaf — a clickable button.
 */
public class Button implements UIComponent {

    private final String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "[Button: " + label + "]");
    }
}
