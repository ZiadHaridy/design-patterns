/**
 * BAD EXAMPLE: All state logic crammed into if/else based on a string variable.
 *
 * Problems:
 *  1. Adding a new state (e.g. "OutOfStock") means editing insertCoin(),
 *     pressButton(), and dispense() — every method touches every state.
 *  2. Illegal transitions (e.g. pressing button with no coin) are scattered
 *     through every method.
 *  3. State logic is duplicated and hard to test in isolation.
 */
public class VendingMachine {

    private String state = "IDLE";   // IDLE | HAS_COIN | DISPENSING
    private int items = 3;

    public void insertCoin() {
        if (state.equals("IDLE")) {
            System.out.println("Coin inserted. Press button to dispense.");
            state = "HAS_COIN";
        } else if (state.equals("HAS_COIN")) {
            System.out.println("Coin already inserted. Press button.");
        } else if (state.equals("DISPENSING")) {
            System.out.println("Please wait, dispensing...");
        }
    }

    public void pressButton() {
        if (state.equals("IDLE")) {
            System.out.println("Insert a coin first.");
        } else if (state.equals("HAS_COIN")) {
            System.out.println("Dispensing item...");
            state = "DISPENSING";
            dispense();
        } else if (state.equals("DISPENSING")) {
            System.out.println("Already dispensing.");
        }
    }

    private void dispense() {
        if (state.equals("DISPENSING")) {
            if (items > 0) {
                items--;
                System.out.println("Item dispensed! " + items + " left.");
            } else {
                System.out.println("Out of stock!");
            }
            state = "IDLE";
        }
    }
}
