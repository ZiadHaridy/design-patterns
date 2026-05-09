import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Invoker — a remote with configurable command slots and undo.
 */
public class SmartHomeRemote {

    private final Command[] slots;
    private final Deque<Command> history = new ArrayDeque<>();

    public SmartHomeRemote(int slotCount) {
        slots = new Command[slotCount];
    }

    public void setSlot(int slot, Command cmd) {
        slots[slot] = cmd;
    }

    public void pressSlot(int slot) {
        if (slot >= 0 && slot < slots.length && slots[slot] != null) {
            slots[slot].execute();
            history.push(slots[slot]);
        } else {
            System.out.println("Slot " + slot + " is empty.");
        }
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            history.pop().undo();
        }
    }
}
