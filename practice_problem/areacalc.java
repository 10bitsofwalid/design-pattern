public class areacalc {

    public double calCircle(double radius) {
        return 3.1416 * radius * radius;
    }

    public double calTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public double calcRectangle(double length, double breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        areacalc area1 = new areacalc();

        double calCircle = area1.calCircle(12);
        System.out.println(" " + calCircle);

        double calTriangle = area1.calTriangle(12, 15);
        System.out.println(" " + calTriangle);

        double calcRectangle = area1.calcRectangle(10, 5);
        System.out.println(" " + calcRectangle);

    }
}
