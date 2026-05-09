public class Main {
    public static void main(String[] args) {
        new Button().click();
        System.out.println("\nProblem: Button is hard-wired to FormValidator and ApiService.");
        System.out.println("Reusing Button elsewhere requires editing it or duplicating it.");
    }
}
