public class PausedState implements PlayerState {
    @Override public void play(MediaPlayer p)  { System.out.println("[Paused] Resumed."); p.setState(new PlayingState()); }
    @Override public void pause(MediaPlayer p) { System.out.println("[Paused] Already paused."); }
    @Override public void stop(MediaPlayer p)  { System.out.println("[Paused] Stopped."); p.setState(new StoppedState()); }
}
