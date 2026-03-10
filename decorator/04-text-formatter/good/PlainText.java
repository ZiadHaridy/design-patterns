/**
 * ConcreteComponent — returns text as-is.
 */
public class PlainText implements TextComponent {

    @Override
    public String process(String text) {
        return text;
    }
}
