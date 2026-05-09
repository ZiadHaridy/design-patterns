/**
 * RefinedAbstraction — adds mute on top of the basic remote.
 */
public class AdvancedRemoteControl extends RemoteControl {

    private int savedVolume = 0;

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        if (device.getVolume() > 0) {
            savedVolume = device.getVolume();
            device.setVolume(0);
        } else {
            device.setVolume(savedVolume);
        }
    }
}
