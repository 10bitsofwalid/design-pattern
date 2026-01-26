import java.util.Scanner;

public class rectangle {

    public void area(double length, double width) {
        double area_value = length * width;
        System.out.println("" + area_value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double width = sc.nextDouble();

        rectangle Rectangle = new rectangle();

        Rectangle.area(length, width);

        sc.close();

    }
}
