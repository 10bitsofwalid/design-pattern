import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the secound number: ");
        int number2 = sc.nextInt();

        System.out.println("1. Add, 2. Sub, 3. Divide, 4. Multiply");
        System.out.println("Enter a number from 1 to 4: ");
        int calc = sc.nextInt();
        switch (calc) {
            case 1:
                int add = number1 + number2;
                System.out.println("" + add);
                break;
            case 2:
                int sub = number1 - number2;
                System.out.println("" + sub);
                break;
            case 3:
                int divide = number1 / number2;
                System.out.println("" + divide);
                break;
            case 4:
                int multiply = number1 * number2;
                System.out.println("" + multiply);
                break;

            default:
                System.out.println("Invalid input!");
                break;
        }
        sc.close();
    }
}
