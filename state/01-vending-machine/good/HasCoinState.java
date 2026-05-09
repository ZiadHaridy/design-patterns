public class HasCoinState implements VendingState {

    @Override
    public void insertCoin(VendingMachine vm) {
        System.out.println("[HasCoin] Coin already inserted.");
    }

    @Override
    public void pressButton(VendingMachine vm) {
        System.out.println("[HasCoin] Button pressed. Dispensing...");
        vm.setState(new DispensingState());
        vm.dispense();
    }

    @Override
    public void dispense(VendingMachine vm) {
        System.out.println("[HasCoin] Press the button first.");
    }
}
