package BankingSystemCP02;

public class Main {
    public static void main(String[] args) {
        // TODO: Create a SavingsAccount using the factory and verify it prints "This is a Savings Account"
        
        // TODO: Create a CheckingAccount using the factory and verify it prints "This is a Checking Account"
        
        BankAccount savings = BankAccountFactory.createAccount("Savings", "SAV-001", 5000.00);
        savings.accountType();
        
        BankAccount checking = BankAccountFactory.createAccount("Checking", "CHK-001", 3000.00);
        checking.accountType();
        
        try {
            BankAccount unknown = BankAccountFactory.createAccount("Investment", "INV-001", 1000.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}
