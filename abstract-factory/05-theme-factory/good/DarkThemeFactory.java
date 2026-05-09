public class DarkThemeFactory implements ThemeFactory {

    @Override public ThemedButton    createButton()    { return new DarkButton();    }
    @Override public ThemedTextField createTextField() { return new DarkTextField(); }
}
