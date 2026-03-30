package BankingSystemCP02;

public class BankAccountFactory {

    // TODO: Implement the createAccount method to return the correct account type
    public static BankAccount createAccount(String type, String accountNumber, double balance) {
         // TODO: Implement the switch case based on the type parameter
        // TODO: If type is "Savings", return a new instance of SavingsAccount with accountNumber and balance
        // TODO: If type is "Checking", return a new instance of CheckingAccount with accountNumber and balance
        // TODO: For any other type, throw an IllegalArgumentException with a message "Unknown account type: " + type
        
        switch (type) {
            case "Savings":
                return new SavingsAccount(accountNumber, balance);
            case "Checking":
                return new CheckingAccount(accountNumber, balance);
            default:
                throw new IllegalArgumentException("Unknown account type: " + type);
        }

    }
}