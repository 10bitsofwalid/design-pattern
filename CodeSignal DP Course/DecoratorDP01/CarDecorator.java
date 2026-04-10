package DecoratorDP01;

public class CarDecorator implements Car {
    private Car decoratedCar;

    public CarDecorator(Car car) {
        this.decoratedCar = car;
    }

    @Override
    public String assemble() {
        return decoratedCar.assemble();
    }
}