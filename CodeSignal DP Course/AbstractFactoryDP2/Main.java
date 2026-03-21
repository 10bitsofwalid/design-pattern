package AbstractFactoryDP2;

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Car object using the factory and call the drive method
        // Should Output: Driving a car.
        
        Vehicle car = VehicleFactory.createVehicle(new CarFactory());
        car.drive();

        // TODO: Create a Bike object using the factory and call the drive method
        // Should Output: Riding a bike.
        
        Vehicle bike = VehicleFactory.createVehicle(new BikeFactory());
        bike.drive();
    }
}