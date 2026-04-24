/**
 * GOOD: Every UI element implements UIComponent.
 * Containers (Window, Panel) hold UIComponent children — including other containers.
 */
public class Main {

    public static void main(String[] args) {
        Window window = new Window("Settings");

        Panel header = new Panel("header");
        header.add(new Label("Preferences"));

        Panel body = new Panel("body");
        body.add(new Label("Theme:"))
            .add(new Button("Light"))
            .add(new Button("Dark"));

        Panel footer = new Panel("footer");
        footer.add(new Button("Save"))
              .add(new Button("Cancel"));

        window.add(header).add(body).add(footer);

        window.render("");

        System.out.println("\nSuccess: rendering recurses through polymorphism.");
        System.out.println("Adding ScrollPanel = one new Container subclass. No edits anywhere else.");
    }
}
