/**
 * Client — uses the abstract factory and the abstract products only.
 * Doesn't know — and can't accidentally mix — concrete platforms.
 */
public class App {

    private final Button button;
    private final Checkbox checkbox;

    public App(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderForm() {
        button.paint();
        checkbox.paint();
    }
}
