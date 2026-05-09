/**
 * ConcreteImplementor — a television.
 */
public class Tv implements Device {

    private boolean on = false;
    private int volume = 30;

    @Override public void enable()  { on = true;  System.out.println("[TV]    powered on"); }
    @Override public void disable() { on = false; System.out.println("[TV]    powered off"); }
    @Override public boolean isEnabled() { return on; }
    @Override public int  getVolume()    { return volume; }
    @Override public void setVolume(int v) {
        volume = Math.max(0, Math.min(100, v));
        System.out.println("[TV]    volume = " + volume);
    }
}
