public class DispensingState implements VendingState {

    @Override
    public void insertCoin(VendingMachine vm) {
        System.out.println("[Dispensing] Wait — currently dispensing.");
    }

    @Override
    public void pressButton(VendingMachine vm) {
        System.out.println("[Dispensing] Already dispensing.");
    }

    @Override
    public void dispense(VendingMachine vm) {
        if (vm.getItems() > 0) {
            vm.setItems(vm.getItems() - 1);
            System.out.println("[Dispensing] Item dispensed! " + vm.getItems() + " left.");
            vm.setState(new IdleState());
        } else {
            System.out.println("[Dispensing] Out of stock!");
            vm.setState(new IdleState());
        }
    }
}
