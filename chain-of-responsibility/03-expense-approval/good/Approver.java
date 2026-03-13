/**
 * Handler — abstract base for the approval chain.
 * Each approver has a spending limit and a reference to the next.
 */
public abstract class Approver {

    private Approver next;
    protected String title;
    protected double limit;

    public Approver(String title, double limit) {
        this.title = title;
        this.limit = limit;
    }

    public Approver setNext(Approver handler) {
        this.next = handler;
        return handler;
    }

    public void approve(String employeeName, double amount) {
        if (amount <= limit) {
            System.out.println(title + " approved $" + amount + " for " + employeeName + ".");
        } else if (next != null) {
            System.out.println(title + " cannot approve $" + amount + ". Escalating...");
            next.approve(employeeName, amount);
        } else {
            System.out.println("REJECTED: $" + amount + " exceeds all approval limits.");
        }
    }
}
