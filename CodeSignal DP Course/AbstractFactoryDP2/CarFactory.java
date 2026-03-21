package AbstractFactoryDP2;

public class CarFactory implements VehicleAbstractFactory {
    @Override
    // TODO: Complete the method to return a new Car object
    public Vehicle createVehicle() {
        return new Car();
    }
}