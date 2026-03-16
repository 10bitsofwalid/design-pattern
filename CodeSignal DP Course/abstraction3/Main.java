package abstraction3;

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Laptop object with a power rating of 50 watts and daily usage of 5 hours
        
        Laptop laptop = new Laptop(50, 5);
        
        // TODO: Create a Smartphone object with a power rating of 10 watts and daily usage of 3 hours
        
        Smartphone smartphone = new Smartphone(10, 3);

        // TODO: Print out the power consumption for both devices using the calculatePowerConsumption() method
        
        System.out.println(laptop.calculatePowerConsumption());
        System.out.println(smartphone.calculatePowerConsumption());
    }
}