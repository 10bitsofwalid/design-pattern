package BankingSystemCP06;

public class BankAccountFactory {

    public static BankAccount createAccount(String type, String accountNumber, double balance, String accountType) {
        // TODO: Add an accountType parameter
        switch (type) {
            case "Savings":
                return new SavingsAccount(accountNumber, balance, accountType);
                // TODO: Include accountType in the SavingsAccount constructor
            case "Checking":
                return new CheckingAccount(accountNumber, balance, accountType);
                // TODO: Include accountType in the CheckingAccount constructor
            default:
                throw new IllegalArgumentException("Unknown account type: " + type);
        }
    }
}
