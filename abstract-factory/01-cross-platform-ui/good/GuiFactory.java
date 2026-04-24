/**
 * AbstractFactory — knows how to make a whole consistent set of widgets.
 */
public interface GuiFactory {

    Button createButton();

    Checkbox createCheckbox();
}
