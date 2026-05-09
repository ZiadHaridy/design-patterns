/**
 * GOOD: Remote slots are configured at runtime. Adding a Fan = 2 new Command classes.
 * Remote.pressSlot() never changes.
 */
public class Main {

    public static void main(String[] args) {
        Light livingRoom = new Light("Living Room");
        Thermostat thermostat = new Thermostat();

        SmartHomeRemote remote = new SmartHomeRemote(4);
        remote.setSlot(0, new LightOnCommand(livingRoom));
        remote.setSlot(1, new LightOffCommand(livingRoom));
        remote.setSlot(2, new SetTempCommand(thermostat, 22));
        remote.setSlot(3, new SetTempCommand(thermostat, 18));

        remote.pressSlot(0);
        remote.pressSlot(2);
        System.out.println("\n--- undo last ---");
        remote.undoLast();
        remote.pressSlot(1);

        System.out.println("\nSuccess: remote is a generic invoker. Slots accept any Command.");
    }
}
