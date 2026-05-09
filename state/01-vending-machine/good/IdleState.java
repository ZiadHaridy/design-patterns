public class IdleState implements VendingState {

    @Override
    public void insertCoin(VendingMachine vm) {
        System.out.println("[Idle] Coin inserted. Press button to dispense.");
        vm.setState(new HasCoinState());
    }

    @Override
    public void pressButton(VendingMachine vm) {
        System.out.println("[Idle] Insert a coin first.");
    }

    @Override
    public void dispense(VendingMachine vm) {
        System.out.println("[Idle] Nothing to dispense.");
    }
}
