/**
 * BAD: Every approval level is hardcoded in the if/else.
 */
public class Main {

    public static void main(String[] args) {
        ExpenseApproval approval = new ExpenseApproval();

        approval.approve("Alice", 50);
        System.out.println();
        approval.approve("Bob", 500);
        System.out.println();
        approval.approve("Charlie", 5000);
        System.out.println();
        approval.approve("Diana", 50000);

        System.out.println("\nProblem: Adding CEO approval = editing ExpenseApproval class.");
    }
}
