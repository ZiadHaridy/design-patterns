/**
 * AbstractFactory — produces themed widgets that match each other.
 */
public interface ThemeFactory {

    ThemedButton createButton();

    ThemedTextField createTextField();
}
