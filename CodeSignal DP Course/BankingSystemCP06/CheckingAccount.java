package BankingSystemCP06;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance, String accountType) {
        super(accountNumber, balance, accountType);
        // TODO: Pass the accountType value to the parent class
    }

    @Override
    public void accountDetails() {
        System.out.println("Checking Account [Account Number=" + accountNumber + ", Balance=" + balance + ", Account Type=" + accountType + "]");
        // TODO: Display the accountType in the account details
    }
}
