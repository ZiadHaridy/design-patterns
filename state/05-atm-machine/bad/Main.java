public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.requestCash(100);  // invalid
        atm.insertCard();
        atm.enterPin(0000);    // wrong
        atm.enterPin(1234);
        atm.requestCash(200);
        atm.ejectCard();

        System.out.println("\nProblem: every method has a conditional block for every state.");
    }
}
