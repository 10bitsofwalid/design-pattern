package enumeration3;

public enum CarType {
    SEDAN(1500, 190),
    SUV(2000, 180),
    TRUCK(3000, 120),
    COUPE(1400, 220),
    SPORTS(1200, 300);

    private final double weight;
    private final double topSpeed;

    CarType(double weight, double topSpeed){
        this.weight = weight;
        this.topSpeed = topSpeed;
    }

    public double getWeight(){
        return weight;
    }

    public double getTopSpeed(){
        return topSpeed;
    }

    public double acceleration(){
        final double accel = 2.0;
        return topSpeed/(weight*accel);
    }
}
