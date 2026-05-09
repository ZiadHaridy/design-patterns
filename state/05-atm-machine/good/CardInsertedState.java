public class CardInsertedState implements ATMState {

    private static final int CORRECT_PIN = 1234;

    @Override public void insertCard(ATM atm)            { System.out.println("[CardInserted] Card already inserted."); }
    @Override public void enterPin(ATM atm, int pin) {
        if (pin == CORRECT_PIN) { System.out.println("[CardInserted] PIN correct."); atm.setState(new PinVerifiedState()); }
        else                    { System.out.println("[CardInserted] Wrong PIN. Try again."); }
    }
    @Override public void requestCash(ATM atm, int amt)  { System.out.println("[CardInserted] Enter PIN first."); }
    @Override public void ejectCard(ATM atm)             { System.out.println("[CardInserted] Card ejected."); atm.setState(new IdleState()); }
}
