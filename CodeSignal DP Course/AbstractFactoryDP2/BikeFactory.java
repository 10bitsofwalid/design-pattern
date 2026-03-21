package AbstractFactoryDP2;

public class BikeFactory implements VehicleAbstractFactory {
    @Override
    // TODO: Complete the method to return a new Bike object
    public Vehicle createVehicle() {
        return new Bike();
    }
}