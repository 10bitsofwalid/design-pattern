package abstraction2;

public class Main {
    public static void main(String[] args) {
        // Here we are using the Shape abstract class to create an instance of Circle
        Shape shape = new Circle(3);
        System.out.println("Shape Area: " + shape.area() + ", Perimeter: " + shape.perimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());

        // TODO: Add the Triangle class
        // TODO: Instantiate Triangle class with side length 3 - Note: Don't use base class pointer
        // TODO: Output its area and perimeter
        
        Shape shape2 = new Triangle(3);
        System.out.println("Triangle area: "+shape2.area()+", Perimeter: "+shape2.perimeter());
    }
}
