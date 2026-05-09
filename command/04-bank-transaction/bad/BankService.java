/**
 * BAD: BankService does everything inline. No undo, no audit trail.
 */
public class BankService {

    public void transfer(BankAccount from, BankAccount to, double amount) {
        if (from.getBalance() < amount) {
            System.out.println("[Bank] insufficient funds");
            return;
        }
        from.debit(amount);
        to.credit(amount);
        System.out.println("[Bank] transferred $" + amount);
        // If to.credit() threw an exception, from is already debited — no rollback.
    }
}
