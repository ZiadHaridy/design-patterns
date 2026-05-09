/**
 * Client — uses themed widget abstractions only.
 * Switching the whole form's theme = passing a different ThemeFactory.
 */
public class Form {

    private final ThemedButton button;
    private final ThemedTextField textField;

    public Form(ThemeFactory factory) {
        this.button = factory.createButton();
        this.textField = factory.createTextField();
    }

    public void render() {
        button.render();
        textField.render();
    }
}
