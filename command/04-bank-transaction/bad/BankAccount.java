public class BankAccount {
    private final String name;
    private double balance;
    public BankAccount(String name, double balance) { this.name = name; this.balance = balance; }
    public void debit(double amount)  { balance -= amount; System.out.println("[" + name + "] debited $" + amount + " — balance: $" + balance); }
    public void credit(double amount) { balance += amount; System.out.println("[" + name + "] credited $" + amount + " — balance: $" + balance); }
    public double getBalance() { return balance; }
    public String getName() { return name; }
}
