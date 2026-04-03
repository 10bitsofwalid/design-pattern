package BankingSystemCP06;

public class Main {
    public static void main(String[] args) {
        // Singleton: Enhance logging in DatabaseConnection
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.connect();

        // Factory: Create accounts with an account type field
        // TODO: Provide an accountType argument when creating accounts (like "Individual" and "Business")
        BankAccount savingsAccount = BankAccountFactory.createAccount("Savings", "123456", 1000.00, "Individual");
        BankAccount checkingAccount = BankAccountFactory.createAccount("Checking", "654321", 500.00, "Business");
        savingsAccount.accountDetails();
        checkingAccount.accountDetails();

        // Builder: Create a complex loan application with optional interest rate
        // TODO: Modify the LoanApplicationBuilder to include an optional interest rate parameter
        LoanApplication loanApplication = new LoanApplication.LoanApplicationBuilder("Alice", 50000.00)
                .withTermLength(15)
                .withCollateral("House")
                .build();
        System.out.println(loanApplication);
    }
}
