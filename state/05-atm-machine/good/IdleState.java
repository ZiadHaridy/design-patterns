public class IdleState implements ATMState {
    @Override public void insertCard(ATM atm)            { System.out.println("[Idle] Card inserted. Enter PIN."); atm.setState(new CardInsertedState()); }
    @Override public void enterPin(ATM atm, int pin)     { System.out.println("[Idle] Insert card first."); }
    @Override public void requestCash(ATM atm, int amt)  { System.out.println("[Idle] Insert card first."); }
    @Override public void ejectCard(ATM atm)             { System.out.println("[Idle] No card in machine."); }
}
