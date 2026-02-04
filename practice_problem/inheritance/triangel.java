package inheritance;

public class triangel extends shape {
    private double base;
    private double heigth;

    public triangel(double heigth, double base) {
        this.heigth = heigth;
        this.base = base;
    }

    double area = 1 / 2 * base * heigth;

    public void triangelarea() {
        display();
        System.out.println(" " + area);
    }

}
