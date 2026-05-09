import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Invoker — executes transactions and maintains an audit log for rollback.
 */
public class TransactionManager {

    private final Deque<Transaction> log = new ArrayDeque<>();

    public boolean run(Transaction tx) {
        boolean ok = tx.execute();
        if (ok) log.push(tx);
        return ok;
    }

    public void rollbackLast() {
        if (!log.isEmpty()) {
            log.pop().rollback();
        } else {
            System.out.println("[TransactionManager] nothing to roll back");
        }
    }
}
