/**
 * BAD: play/pause/stop each check the current state string.
 */
public class MediaPlayer {

    private String state = "STOPPED"; // STOPPED | PLAYING | PAUSED

    public void play() {
        if (state.equals("STOPPED"))      { state = "PLAYING"; System.out.println("[Player] Started playing."); }
        else if (state.equals("PAUSED"))  { state = "PLAYING"; System.out.println("[Player] Resumed."); }
        else                              { System.out.println("[Player] Already playing."); }
    }

    public void pause() {
        if (state.equals("PLAYING"))      { state = "PAUSED";  System.out.println("[Player] Paused."); }
        else if (state.equals("PAUSED"))  { System.out.println("[Player] Already paused."); }
        else                              { System.out.println("[Player] Nothing is playing."); }
    }

    public void stop() {
        if (!state.equals("STOPPED"))     { state = "STOPPED"; System.out.println("[Player] Stopped."); }
        else                              { System.out.println("[Player] Already stopped."); }
    }
}
