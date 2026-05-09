public class TruckDealership extends Dealership {
    @Override
    protected Vehicle createVehicle() {
        return new Truck();
    }
}
