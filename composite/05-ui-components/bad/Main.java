/**
 * BAD: Every container type needs its own branch in the renderer.
 */
public class Main {

    public static void main(String[] args) {
        WindowRenderer.Window window = new WindowRenderer.Window("Settings");

        WindowRenderer.Panel header = new WindowRenderer.Panel("header");
        header.children.add(new WindowRenderer.Label("Preferences"));

        WindowRenderer.Panel body = new WindowRenderer.Panel("body");
        body.children.add(new WindowRenderer.Label("Theme:"));
        body.children.add(new WindowRenderer.Button("Light"));
        body.children.add(new WindowRenderer.Button("Dark"));

        window.children.add(header);
        window.children.add(body);

        new WindowRenderer().render(window, "");

        System.out.println("\nProblem: Window and Panel duplicate child-handling logic.");
        System.out.println("Adding ScrollPanel = another instanceof branch.");
    }
}
