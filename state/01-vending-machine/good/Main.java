/**
 * GOOD: Each state class owns its behavior. Transitions are explicit.
 * Adding "OutOfStock" state = one new class + updated transitions in DispensingState.
 */
public class Main {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(2);

        vm.pressButton();   // invalid — no coin
        vm.insertCoin();
        vm.insertCoin();    // already has coin
        vm.pressButton();   // dispense
        vm.insertCoin();
        vm.pressButton();   // dispense last item

        System.out.println("\nSuccess: no if/else in the context. Each state class is self-contained.");
    }
}
