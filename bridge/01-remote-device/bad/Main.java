/**
 * BAD EXAMPLE: One class per Remote-Device combination.
 *
 * To add a new Remote type (AdvancedRemote) or a new Device (Projector),
 * you need a new class for EVERY existing combination.
 *
 * 2 remotes × 2 devices = 4 classes today.
 * 3 remotes × 3 devices = 9 classes — it explodes multiplicatively.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Basic TV remote ===");
        new BasicTvRemote().power();
        new BasicTvRemote().volumeUp();

        System.out.println("\n=== Basic Radio remote ===");
        new BasicRadioRemote().power();
        new BasicRadioRemote().volumeUp();

        System.out.println("\n=== Advanced TV remote ===");
        new AdvancedTvRemote().power();
        new AdvancedTvRemote().mute();

        System.out.println("\nProblem: adding Projector requires 2 new classes (BasicProjectorRemote + AdvancedProjectorRemote).");
    }
}
