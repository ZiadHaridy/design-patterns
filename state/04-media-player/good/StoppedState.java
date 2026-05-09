public class StoppedState implements PlayerState {
    @Override public void play(MediaPlayer p)  { System.out.println("[Stopped] Started playing."); p.setState(new PlayingState()); }
    @Override public void pause(MediaPlayer p) { System.out.println("[Stopped] Nothing playing to pause."); }
    @Override public void stop(MediaPlayer p)  { System.out.println("[Stopped] Already stopped."); }
}
