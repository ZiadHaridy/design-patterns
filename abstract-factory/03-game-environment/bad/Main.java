public class Main {
    public static void main(String[] args) {
        Game g = new Game();

        System.out.println("=== Medieval ===");
        g.playRound("medieval");

        System.out.println("\n=== Sci-Fi ===");
        g.playRound("scifi");

        System.out.println("\nProblem: nothing prevents Knight + LaserRifle.");
    }
}
