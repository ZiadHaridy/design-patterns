public class LightThemeFactory implements ThemeFactory {

    @Override public ThemedButton    createButton()    { return new LightButton();    }
    @Override public ThemedTextField createTextField() { return new LightTextField(); }
}
