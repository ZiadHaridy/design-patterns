/**
 * GOOD: Theme is chosen once. Mixing button/text-field across themes is impossible.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Light ===");
        new Form(new LightThemeFactory()).render();

        System.out.println("\n=== Dark ===");
        new Form(new DarkThemeFactory()).render();

        System.out.println("\nSuccess: adding High-Contrast = 1 ThemeFactory + matching widgets.");
        System.out.println("Form.java doesn't change.");
    }
}
