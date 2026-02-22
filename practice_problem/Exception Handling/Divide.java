public class Divide {
    public static void main(String[] args) {
        int a = 50;
        int b = 0;

        try {
            int div = a / b;
            System.out.println(" " + div);
        } catch (ArithmeticException e) {
            System.out.println("Maths error");
        }
        System.out.println("Continue!");
    }
}
