/**
 * Context — delegates every action to the current state.
 */
public class VendingMachine {

    private VendingState state;
    private int items;

    public VendingMachine(int items) {
        this.items = items;
        this.state = new IdleState();
    }

    public void setState(VendingState s) { this.state = s; }
    public int  getItems()              { return items; }
    public void setItems(int n)         { this.items = n; }

    public void insertCoin()  { state.insertCoin(this); }
    public void pressButton() { state.pressButton(this); }
    public void dispense()    { state.dispense(this); }
}
