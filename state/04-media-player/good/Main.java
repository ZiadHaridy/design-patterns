public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.pause();   // invalid — stopped
        player.play();
        player.play();    // already playing
        player.pause();
        player.play();    // resume
        player.stop();

        System.out.println("\nSuccess: each state class is small and self-contained.");
    }
}
