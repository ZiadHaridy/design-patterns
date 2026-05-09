public class MediaPlayer {

    private PlayerState state = new StoppedState();

    public void setState(PlayerState s) { this.state = s; }

    public void play()  { state.play(this); }
    public void pause() { state.pause(this); }
    public void stop()  { state.stop(this); }
}
