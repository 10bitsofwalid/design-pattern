package abstraction1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(3);
        System.out.println("Shape Area: " + shape.area() + ", Perimeter: " + shape.perimeter());
        // TODO: Print the description of the shape
        System.out.println("Description: "+shape.description());

        shape = new Rectangle(4, 6);
        System.out.println("Shape Area: " + shape.area() + ", Perimeter: " + shape.perimeter());
        // TODO: Print the description of the shape
        System.out.println("Description: "+shape.description());
    }
}
