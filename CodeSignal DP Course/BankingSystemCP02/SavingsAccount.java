package BankingSystemCP02;

// TODO: Create a class SavingsAccount that extends BankAccount.
// TODO: Implement the constructor for SavingsAccount to initialize accountNumber and balance.
// TODO: Override the accountType() method to print "This is a Savings Account".


public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }
    
    public void accountType(){
        System.out.println("This is a savings account");
    }
}

