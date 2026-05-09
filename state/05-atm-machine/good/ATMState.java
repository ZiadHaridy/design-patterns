public interface ATMState {
    void insertCard(ATM atm);
    void enterPin(ATM atm, int pin);
    void requestCash(ATM atm, int amount);
    void ejectCard(ATM atm);
}
