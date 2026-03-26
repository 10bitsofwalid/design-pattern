package PrototypeDP1;

public class Main {
    public static void main(String[] args) {
        Car originalCar = new Car("Sedan", "V6");
        Car clonedCar = (Car) originalCar.cloneVehicle();

        // Display details of the original and cloned cars
        originalCar.showDetails(); // Outputs: Car Model: Sedan, Engine Type: V6
        clonedCar.showDetails();   // Outputs: Car Model: Sedan, Engine Type: V6
    }
}