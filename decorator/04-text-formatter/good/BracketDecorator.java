/**
 * ConcreteDecorator — wraps text in square brackets.
 */
public class BracketDecorator extends TextDecorator {

    public BracketDecorator(TextComponent component) {
        super(component);
    }

    @Override
    public String process(String text) {
        return "[" + wrapped.process(text) + "]";
    }
}
