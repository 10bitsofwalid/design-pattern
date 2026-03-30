package BankingSystemCP02;

// TODO: Define an abstract class BankAccount with protected fields for accountNumber and balance.
// TODO: Implement a constructor to initialize these fields.
// TODO: Add an abstract method named accountType().


public abstract class BankAccount{
    protected String accountNumber;
    protected double balance;
    
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public abstract void accountType();
}