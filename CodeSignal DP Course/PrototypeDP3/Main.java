package PrototypeDP3;

public class Main {
    public static void main(String[] args) {

        Circle originalCircle = new Circle("Red", 5);
        Circle clonedCircle = (Circle) originalCircle.cloneShape();

        System.out.println("Original Circle:");
        originalCircle.showDetails();
        System.out.println("Cloned Circle:");
        clonedCircle.showDetails();

        Rectangle originalRectangle = new Rectangle("Blue", 10, 4);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.cloneShape();

        System.out.println("Original Rectangle:");
        originalRectangle.showDetails();
        System.out.println("Cloned Rectangle:");
        clonedRectangle.showDetails();
    }
}