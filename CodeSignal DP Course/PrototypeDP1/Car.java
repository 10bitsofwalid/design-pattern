package PrototypeDP1;

public class Car extends Vehicle {

    private String engineType;

    // Constructor
    public Car(String model, String engineType) {
        super(model);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    // Clone method
    @Override
    public Vehicle cloneVehicle() {
        return new Car(getModel(), engineType);
    }

    public void showDetails() {
        System.out.println("Car Model: " + getModel() + ", Engine Type: " + engineType);
    }
}