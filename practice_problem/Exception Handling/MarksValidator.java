public class MarksValidator {

    public void check(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("marks invalid");
        } else {
            System.out.println(marks + " valid marks");
        }
    }

    public static void main(String[] args) {
        MarksValidator m1 = new MarksValidator();

        m1.check(80);

        try {
            m1.check(200);
        } catch (IllegalArgumentException e) {
            System.out.println("invalid");
        }

        System.out.println("system continuos");
    }
}
