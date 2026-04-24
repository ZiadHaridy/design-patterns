/**
 * GOOD: Pick a factory once. Every widget is from the same family.
 * Adding Linux = 1 LinuxFactory + Linux versions of each product.
 * App.java doesn't change.
 */
public class Main {

    public static void main(String[] args) {
        GuiFactory factory = pickFactoryFor(System.getProperty("os.name", "Mac"));

        App app = new App(factory);

        System.out.println("=== Form on detected OS ===");
        app.renderForm();

        System.out.println("\n=== Force Windows ===");
        new App(new WindowsFactory()).renderForm();

        System.out.println("\n=== Force Mac ===");
        new App(new MacFactory()).renderForm();

        System.out.println("\nSuccess: each App holds widgets from exactly one family.");
    }

    private static GuiFactory pickFactoryFor(String osName) {
        return osName.toLowerCase().contains("win") ? new WindowsFactory() : new MacFactory();
    }
}
