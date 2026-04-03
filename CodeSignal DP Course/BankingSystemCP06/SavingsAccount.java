package BankingSystemCP06;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance, String accountType) {
        super(accountNumber, balance, accountType);
        // TODO: Pass the accountType value to the parent class
    }

    @Override
    public void accountDetails() {
        System.out.println("Savings Account [Account Number=" + accountNumber + ", Balance=" + balance + ", Account Type=" + accountType +  "]");
        // TODO: Display the accountType in the account details
    }
}
