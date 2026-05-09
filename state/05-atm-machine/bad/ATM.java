/**
 * BAD: ATM has 4 states × 4 actions = 16 conditional branches.
 */
public class ATM {

    private String state = "IDLE"; // IDLE | CARD_INSERTED | PIN_VERIFIED | DISPENSING
    private int cash = 1000;

    public void insertCard() {
        if (state.equals("IDLE"))           { state = "CARD_INSERTED"; System.out.println("Card inserted. Enter PIN."); }
        else                                { System.out.println("Card already inserted."); }
    }

    public void enterPin(int pin) {
        if (state.equals("CARD_INSERTED")) {
            if (pin == 1234)                { state = "PIN_VERIFIED"; System.out.println("PIN correct."); }
            else                            { System.out.println("Wrong PIN. Try again."); }
        } else                              { System.out.println("Insert card first."); }
    }

    public void requestCash(int amount) {
        if (state.equals("PIN_VERIFIED")) {
            if (cash >= amount)             { state = "DISPENSING"; dispense(amount); }
            else                            { System.out.println("Insufficient cash in ATM."); }
        } else                              { System.out.println("Verify PIN first."); }
    }

    private void dispense(int amount) {
        cash -= amount;
        System.out.println("Dispensing $" + amount + ". Remaining in ATM: $" + cash);
        state = "IDLE";
    }

    public void ejectCard() {
        if (!state.equals("IDLE"))          { state = "IDLE"; System.out.println("Card ejected."); }
        else                                { System.out.println("No card in machine."); }
    }
}
