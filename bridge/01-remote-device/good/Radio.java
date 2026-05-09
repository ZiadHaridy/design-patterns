/**
 * ConcreteImplementor — a radio.
 */
public class Radio implements Device {

    private boolean on = false;
    private int volume = 50;

    @Override public void enable()  { on = true;  System.out.println("[Radio] powered on"); }
    @Override public void disable() { on = false; System.out.println("[Radio] powered off"); }
    @Override public boolean isEnabled() { return on; }
    @Override public int  getVolume()    { return volume; }
    @Override public void setVolume(int v) {
        volume = Math.max(0, Math.min(100, v));
        System.out.println("[Radio] volume = " + volume);
    }
}
