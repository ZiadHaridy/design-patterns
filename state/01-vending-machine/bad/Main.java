public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.pressButton();   // no coin
        vm.insertCoin();
        vm.insertCoin();    // duplicate
        vm.pressButton();

        System.out.println("\nProblem: adding OutOfStock state = editing all 3 methods.");
    }
}
