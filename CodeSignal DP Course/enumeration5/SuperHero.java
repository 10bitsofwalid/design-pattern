package enumeration5;

public enum SuperHero {
    SUPERMAN(1.0, 100.0),
    BATMAN(0.8, 10.0),
    WONDER_WOMAN(1.2, 50.0),
    FLASH(0.7, 5.0);

    // TODO: Declare private final fields for strength and speed
    private final double strength;
    private final double speed;

    // Constructor
    // TODO: Complete the implementation for the Superhero constructor
    SuperHero(double strength, double speed) {
        this.strength = strength;
        this.speed = speed;
    }

    // Accessor methods
    // TODO: Complete the implementation for the the strength getter
    public double getStrength() {
        return strength;
    }

    // TODO: Complete the implementation for the the speed getter
    public double getSpeed() {
        return speed;
    }

    // TODO: Define a method to calculate the power level (as strength * speed)
    public double powerLevel() {
        return (double) strength*speed;
    }
}
