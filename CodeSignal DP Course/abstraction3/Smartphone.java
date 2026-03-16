package abstraction3;

public class Smartphone extends Device {
    private double dailyUsage; // in hours

    public Smartphone(double powerRating, double dailyUsage) {
        super(powerRating);
        this.dailyUsage = dailyUsage;
    }

    // TODO: Implement the usageHours() method to return the dailyUsage
    public double usageHours(){
        return dailyUsage;
    }
}
