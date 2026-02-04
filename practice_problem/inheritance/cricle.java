package inheritance;

public class cricle extends shape {
    private double radius;

    public cricle(double radius) {
        this.radius = radius;
    }

    double area = 3.1416 * radius * radius;

    public void criclearea() {
        display();
        System.out.println(" " + area);
    }

}
