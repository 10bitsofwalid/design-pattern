package DecoratorDP01;

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Sports Car Features";
    }
}
