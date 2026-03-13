/**
 * BAD EXAMPLE: Approval thresholds hardcoded in if/else.
 *
 * Problems:
 *  1. Changing approval limits requires editing this class.
 *  2. Adding a new approval level (e.g., CEO) requires modifying the method.
 *  3. Approval logic is not reusable or testable per level.
 */
public class ExpenseApproval {

    public void approve(String employeeName, double amount) {
        System.out.println(employeeName + " submitted expense: $" + amount);

        if (amount <= 100) {
            System.out.println("Manager approved $" + amount + ".");

        } else if (amount <= 1000) {
            System.out.println("Manager cannot approve. Escalating...");
            System.out.println("Director approved $" + amount + ".");

        } else if (amount <= 10000) {
            System.out.println("Manager cannot approve. Escalating...");
            System.out.println("Director cannot approve. Escalating...");
            System.out.println("VP approved $" + amount + ".");

        } else {
            System.out.println("Manager cannot approve. Escalating...");
            System.out.println("Director cannot approve. Escalating...");
            System.out.println("VP cannot approve. Escalating...");
            System.out.println("REJECTED: Amount $" + amount + " exceeds all approval limits.");
        }
    }
}
