public class ATM {

    private ATMState state = new IdleState();
    private int cash;

    public ATM(int cash) { this.cash = cash; }

    public void setState(ATMState s) { this.state = s; }
    public int  getCash()            { return cash; }
    public void dispenseCash(int amount) {
        cash -= amount;
        System.out.println("[ATM] dispensing $" + amount + ". Remaining: $" + cash);
    }

    public void insertCard()            { state.insertCard(this); }
    public void enterPin(int pin)       { state.enterPin(this, pin); }
    public void requestCash(int amount) { state.requestCash(this, amount); }
    public void ejectCard()             { state.ejectCard(this); }
}
