package abstraction3;

public abstract class Device {
    private double powerRating; // in watts

    public Device(double powerRating) {
        this.powerRating = powerRating;
    }

    // TODO: Declare an abstract method usageHours() that returns a double
    public abstract double usageHours();

    // TODO: Implement a concrete method calculatePowerConsumption() that calculates and returns power consumption using powerRating and usageHours
    public double calculatePowerConsumption(){
        return powerRating*usageHours();
    }
}
