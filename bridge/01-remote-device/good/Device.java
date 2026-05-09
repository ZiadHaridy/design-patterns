/**
 * Implementor — the low-level device interface.
 */
public interface Device {
    void enable();
    void disable();
    int  getVolume();
    void setVolume(int volume);
    boolean isEnabled();
}
