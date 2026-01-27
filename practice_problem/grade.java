import java.util.Scanner;

public class grade {

    private double Maths;
    private double Physics;
    private double Chemistry;

    public grade(double Maths, double Physics, double Chemistry) {
        this.Maths = Maths;
        this.Physics = Physics;
        this.Chemistry = Chemistry;
    }

    public void average() {
        double avg = (Maths + Physics + Chemistry) / 3;

        System.out.println("" + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for maths: ");
        double Maths = sc.nextDouble();

        System.out.println("Enter marks for physics: ");
        double Physics = sc.nextDouble();

        System.out.println("Enter marks for chemistry: ");
        double Chemistry = sc.nextDouble();

        grade cgpa = new grade(Maths, Physics, Chemistry);

        cgpa.average();

        sc.close();
    }
}
