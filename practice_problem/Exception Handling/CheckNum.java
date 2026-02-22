import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        try {
            int number = Integer.parseInt(a);
            System.out.println(number + " is valid");
        } catch (NumberFormatException e) {
            System.out.println("invalid");
        }
        System.out.println("system continues!");

        sc.close();
    }
}
