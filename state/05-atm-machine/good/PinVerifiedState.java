public class PinVerifiedState implements ATMState {

    @Override public void insertCard(ATM atm)            { System.out.println("[PinVerified] Card already in."); }
    @Override public void enterPin(ATM atm, int pin)     { System.out.println("[PinVerified] PIN already verified."); }
    @Override public void requestCash(ATM atm, int amt) {
        if (atm.getCash() >= amt) { atm.dispenseCash(amt); atm.setState(new IdleState()); }
        else                      { System.out.println("[PinVerified] Insufficient cash in ATM."); atm.setState(new IdleState()); }
    }
    @Override public void ejectCard(ATM atm)             { System.out.println("[PinVerified] Card ejected."); atm.setState(new IdleState()); }
}
