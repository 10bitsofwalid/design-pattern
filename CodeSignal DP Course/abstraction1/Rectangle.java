package abstraction1;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }

    // TODO: Implement the description method for Rectangle
    // return "This is a rectangle.";
    String description(){
        return "This is a Rectangle";
    }
}