/**
 * Component — the base UI abstraction. Both leaves (Button, Label)
 * and containers (Panel, Window) implement it.
 */
public interface UIComponent {

    void render(String indent);
}
