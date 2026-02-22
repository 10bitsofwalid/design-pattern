import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your payment method: CREDITCARD/PAYPAL/BANKTRANSFER");
        String choice = sc.nextLine();

        System.out.println("Enter amount: ");
        int amount = sc.nextInt();

        try {
            Payment payment = PaymentFactory.paymentGateWay(choice);
            payment.pay(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Payment error");
        }

        System.out.println("system continious");
        sc.close();
    }
}
