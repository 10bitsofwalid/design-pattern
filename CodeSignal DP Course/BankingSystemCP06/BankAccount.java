package BankingSystemCP06;

public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;
    // TODO: Add an accountType field
    protected String accountType;

    public BankAccount(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        // TODO: Initialize the accountType field
        this.accountType = accountType;
    }

    public abstract void accountDetails();
}