package BehaviouralDesignPattern02;

// TODO: Implement the BitcoinStrategy class that should allow payments using Bitcoin.
// - Implement the PaymentStrategy interface.
// - Add a private field for the Bitcoin wallet address.
// - Implement a constructor to initialize the wallet address.
// - Override the pay method to print a message showing the amount and the wallet address.

public class BitcoinStrategy implements PaymentStrategy {
    private String walletAddress;

    public BitcoinStrategy(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin wallet: " + walletAddress);
    }
}
