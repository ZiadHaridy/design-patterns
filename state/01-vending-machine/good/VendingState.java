/**
 * State — every vending machine state implements these actions.
 */
public interface VendingState {
    void insertCoin(VendingMachine vm);
    void pressButton(VendingMachine vm);
    void dispense(VendingMachine vm);
}
