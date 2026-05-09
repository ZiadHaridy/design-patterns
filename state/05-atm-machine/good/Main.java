/**
 * GOOD: ATM delegates every action to the current state.
 * Each state class is focused and independently testable.
 */
public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM(1000);

        atm.requestCash(100);   // invalid — idle
        atm.insertCard();
        atm.enterPin(9999);     // wrong PIN
        atm.enterPin(1234);
        atm.requestCash(200);
        atm.ejectCard();        // no card left

        System.out.println("\nSuccess: ATM context never changes. Each state handles its own transitions.");
    }
}
