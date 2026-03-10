/**
 * ConcreteDecorator — trims whitespace from the result.
 */
public class TrimDecorator extends TextDecorator {

    public TrimDecorator(TextComponent component) {
        super(component);
    }

    @Override
    public String process(String text) {
        return wrapped.process(text).trim();
    }
}
