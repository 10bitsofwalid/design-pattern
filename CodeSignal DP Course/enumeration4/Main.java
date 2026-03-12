package enumeration4;

public class Main {
    public static void main(String[] args) {
        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit + ": calories = " + fruit.getCalories() + ", sugar = " + fruit.getSugar()
                + ", sugar-to-calorie ratio = " + fruit.sugarToCalorieRatio());
        }
    }
}
