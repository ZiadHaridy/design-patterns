/**
 * BAD: Remote knows exactly what each slot does. Adding a new device/action
 * means editing the remote.
 */
public class SmartHomeRemote {

    private final Light light = new Light("Living Room");
    private final Thermostat thermostat = new Thermostat();

    public void pressSlot(int slot) {
        if (slot == 1) {
            light.on();
        } else if (slot == 2) {
            light.off();
        } else if (slot == 3) {
            thermostat.setTemp(22);
        } else if (slot == 4) {
            thermostat.setTemp(18);
        } else {
            System.out.println("Slot " + slot + " is empty.");
        }
    }
}
