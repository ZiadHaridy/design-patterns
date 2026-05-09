public class Main {

    public static void main(String[] args) {
        BankAccount alice = new BankAccount("Alice", 1000);
        BankAccount bob   = new BankAccount("Bob",   500);

        TransactionManager manager = new TransactionManager();

        System.out.println("=== Normal transfer ===");
        manager.run(new TransferTransaction(alice, bob, 200));

        System.out.println("\n=== Roll back the transfer ===");
        manager.rollbackLast();

        System.out.println("\n=== Insufficient funds ===");
        manager.run(new TransferTransaction(alice, bob, 5000));

        System.out.println("\nSuccess: transactions encapsulate undo state. Manager is generic.");
    }
}
