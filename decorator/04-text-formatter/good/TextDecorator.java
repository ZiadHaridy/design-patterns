/**
 * Base Decorator — wraps a TextComponent and delegates to it.
 */
public abstract class TextDecorator implements TextComponent {

    protected TextComponent wrapped;

    public TextDecorator(TextComponent component) {
        this.wrapped = component;
    }
}
