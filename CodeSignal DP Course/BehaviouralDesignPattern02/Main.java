package BehaviouralDesignPattern02;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        CreditCardStrategy creditCard = new CreditCardStrategy("1234-5678-9876-5432");
        PayPalStrategy payPal = new PayPalStrategy("user@example.com");
        
        // TODO: Create an instance of BitcoinStrategy with a sample wallet address.
         BitcoinStrategy bitcoin = new BitcoinStrategy("1A2B3C4D5E6F7G8H9I");

        cart.setPaymentStrategy(creditCard);
        cart.checkout(100);

        cart.setPaymentStrategy(payPal);
        cart.checkout(200);

        // TODO: Set the payment strategy to Bitcoin and checkout with a sample amount.
        
        cart.setPaymentStrategy(bitcoin);
        cart.checkout(300);
    }
}