package enumeration4;

/*You're given a Java program that defines an enumeration Fruit representing different kinds of fruits, with associated attributes calories and sugar. 
The Fruit enum includes a method sugarToCalorieRatio() that calculates the sugar-to-calorie ratio for each fruit.

However, there is a mistake in the code related to the immutability of the calories and sugar fields. 
Let's find and fix that error. */

public enum Fruit {
    APPLE(52, 10),
    ORANGE(47, 8),
    BANANA(96, 12),
    GRAPE(69, 17);

    private final int calories;
    private final int sugar;

    Fruit(int calories, int sugar) {
        this.calories = calories;
        this.sugar = sugar;
    }

    public int getCalories() {
        return calories;
    }

    public int getSugar() {
        return sugar;
    }

    public double sugarToCalorieRatio() {
        return (double) sugar / calories;
    }
}
