package abstraction1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    // TODO: Implement the description method for Circle
    // return "This is a circle.";
    String description(){
        return "This is a circle";
    }
}