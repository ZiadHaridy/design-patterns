public class Main {
    public static void main(String[] args) {
        MediaPlayer p = new MediaPlayer();
        p.pause();  // invalid
        p.play();
        p.play();   // already playing
        p.pause();
        p.play();   // resume
        p.stop();

        System.out.println("\nProblem: every method re-checks the state string.");
    }
}
