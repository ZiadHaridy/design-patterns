/**
 * ConcreteDecorator — converts text to uppercase.
 */
public class UpperCaseDecorator extends TextDecorator {

    public UpperCaseDecorator(TextComponent component) {
        super(component);
    }

    @Override
    public String process(String text) {
        return wrapped.process(text).toUpperCase();
    }
}
