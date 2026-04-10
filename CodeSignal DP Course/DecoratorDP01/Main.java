package DecoratorDP01;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        System.out.println(sportsCar.assemble()); // Outputs: Basic Car + Sports Car Features

        Car luxuryCar = new LuxuryCar(new BasicCar());
        System.out.println(luxuryCar.assemble()); // Outputs: Basic Car + Luxury Car Features
    }
}