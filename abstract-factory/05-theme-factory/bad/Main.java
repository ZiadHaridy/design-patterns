public class Main {
    public static void main(String[] args) {
        Form f = new Form();

        System.out.println("=== Light ===");
        f.render("light");

        System.out.println("\n=== Dark ===");
        f.render("dark");

        System.out.println("\nProblem: each widget repeats the theme check.");
    }
}
