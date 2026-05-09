public class Main {
    public static void main(String[] args) {
        BankAccount alice = new BankAccount("Alice", 1000);
        BankAccount bob   = new BankAccount("Bob",   500);

        new BankService().transfer(alice, bob, 200);

        System.out.println("\nProblem: no rollback if credit fails. No audit log. No undo.");
    }
}
