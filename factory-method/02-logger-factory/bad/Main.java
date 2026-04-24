/**
 * BAD: Application.run() decides the logger type AND knows how each one logs.
 */
public class Main {

    public static void main(String[] args) {
        Application app = new Application();

        System.out.println("=== console mode ===");
        app.run("console");

        System.out.println("\n=== file mode ===");
        app.run("file");

        System.out.println("\nProblem: every new logger forces edits to Application.");
    }
}
