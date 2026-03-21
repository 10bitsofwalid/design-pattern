package AbstractFactoryDP2;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleAbstractFactory factory) {
        return factory.createVehicle();
    }
}