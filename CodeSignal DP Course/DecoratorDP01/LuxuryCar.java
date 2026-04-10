package DecoratorDP01;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Luxury Car Features";
    }
}