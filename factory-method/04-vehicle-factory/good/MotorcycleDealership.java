public class MotorcycleDealership extends Dealership {
    @Override
    protected Vehicle createVehicle() {
        return new Motorcycle();
    }
}
