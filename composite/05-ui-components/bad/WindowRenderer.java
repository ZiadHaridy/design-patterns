import java.util.ArrayList;
import java.util.List;

/**
 * BAD EXAMPLE: A UI toolkit where Button/Label are unrelated to Panel/Window.
 * Layout and rendering must instanceof every container type.
 *
 * Problems:
 *  1. Adding a new container (e.g. ScrollPanel) requires editing every traversal.
 *  2. A "render" method has to know about every leaf widget AND every container.
 *  3. Nested containers (panel inside panel inside window) bloat the dispatch logic.
 */
public class WindowRenderer {

    public static class Button { public String label; public Button(String l) { this.label = l; } }
    public static class Label  { public String text;  public Label(String t)  { this.text  = t; } }

    public static class Panel {
        public String title;
        public List<Object> children = new ArrayList<>(); // Button, Label, Panel, or Window
        public Panel(String title) { this.title = title; }
    }

    public static class Window {
        public String title;
        public List<Object> children = new ArrayList<>();
        public Window(String title) { this.title = title; }
    }

    public void render(Object component, String indent) {
        if (component instanceof Button) {
            System.out.println(indent + "[Button: " + ((Button) component).label + "]");
        } else if (component instanceof Label) {
            System.out.println(indent + "[Label: " + ((Label) component).text + "]");
        } else if (component instanceof Panel) {
            Panel p = (Panel) component;
            System.out.println(indent + "Panel(" + p.title + ") {");
            for (Object child : p.children) render(child, indent + "  ");
            System.out.println(indent + "}");
        } else if (component instanceof Window) {
            Window w = (Window) component;
            System.out.println(indent + "Window(" + w.title + ") {");
            for (Object child : w.children) render(child, indent + "  ");
            System.out.println(indent + "}");
        }
    }
}
