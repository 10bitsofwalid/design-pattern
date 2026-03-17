package abstraction4;

public class Car extends Vehicle {
    private double engineDisplacement;

    public Car(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public double speed() {
        return engineDisplacement * 2;
    }
    
    public double fuelEfficiency(){
        return engineDisplacement*3;
    }
}