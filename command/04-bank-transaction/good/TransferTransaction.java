/**
 * ConcreteCommand — a debit+credit pair that can be rolled back atomically.
 */
public class TransferTransaction implements Transaction {

    private final BankAccount from;
    private final BankAccount to;
    private final double amount;
    private boolean executed = false;

    public TransferTransaction(BankAccount from, BankAccount to, double amount) {
        this.from = from; this.to = to; this.amount = amount;
    }

    @Override
    public boolean execute() {
        if (!from.debit(amount)) return false;
        to.credit(amount);
        executed = true;
        System.out.println("[Transaction] transfer $" + amount + " from " + from.getName() + " to " + to.getName() + " — OK");
        return true;
    }

    @Override
    public void rollback() {
        if (!executed) return;
        to.debit(amount);
        from.credit(amount);
        System.out.println("[Transaction] rolled back $" + amount);
    }
}
