package BuilderDP4;

public class Main {
    public static void main(String[] args) {
        // TODO: Use the CarBuilder to build a Car object with make, model, and optional parameters

        // TODO: Print out some of the Car properties using the getters
        
        Car car = new Car.CarBuilder("Toyota", "Camry")
                .setSunroof(true)
                .setGPS(true)
                .setHeatedSeats(true)
                .build();

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Has Sunroof: " + car.hasSunroof());
        System.out.println("Has GPS: " + car.hasGPS());
        System.out.println("Has Heated Seats: " + car.hasHeatedSeats());
    }
}