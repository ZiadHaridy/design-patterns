public class PlayingState implements PlayerState {
    @Override public void play(MediaPlayer p)  { System.out.println("[Playing] Already playing."); }
    @Override public void pause(MediaPlayer p) { System.out.println("[Playing] Paused."); p.setState(new PausedState()); }
    @Override public void stop(MediaPlayer p)  { System.out.println("[Playing] Stopped."); p.setState(new StoppedState()); }
}
