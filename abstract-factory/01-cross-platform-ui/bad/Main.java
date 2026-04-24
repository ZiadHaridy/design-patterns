public class Main {
    public static void main(String[] args) {
        App app = new App();

        System.out.println("=== Windows ===");
        app.renderForm("windows");

        System.out.println("\n=== Mac ===");
        app.renderForm("mac");

        System.out.println("\nProblem: every widget repeats the platform if/else.");
        System.out.println("Nothing stops mixing widgets from different platforms.");
    }
}
