package BankingSystemCP02;

// TODO: Create a class CheckingAccount that extends BankAccount.
// TODO: Implement the constructor for CheckingAccount to initialize accountNumber and balance.
// TODO: Override the accountType() method to print "This is a Checking Account".


public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }
    
    public void accountType(){
        System.out.println("This is a checking account");
    }
}
