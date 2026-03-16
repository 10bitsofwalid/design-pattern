package abstraction3;

public class Laptop extends Device {
    private double dailyUsage; // in hours

    public Laptop(double powerRating, double dailyUsage) {
        super(powerRating);
        this.dailyUsage = dailyUsage;
    }

    // TODO: Implement the usageHours() method to return the dailyUsage
    public double usageHours(){
        return dailyUsage;
    }
}
