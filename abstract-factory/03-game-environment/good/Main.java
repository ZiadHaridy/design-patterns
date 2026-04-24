/**
 * GOOD: A Game built from a MedievalWorldFactory cannot ever produce a LaserRifle.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Medieval ===");
        new Game(new MedievalWorldFactory()).playRound();

        System.out.println("\n=== Sci-Fi ===");
        new Game(new SciFiWorldFactory()).playRound();

        System.out.println("\nSuccess: era consistency is enforced by which factory you pick.");
    }
}
