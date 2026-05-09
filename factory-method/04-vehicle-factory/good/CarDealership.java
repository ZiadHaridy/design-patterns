public class CarDealership extends Dealership {
    @Override
    protected Vehicle createVehicle() {
        return new Car();
    }
}
