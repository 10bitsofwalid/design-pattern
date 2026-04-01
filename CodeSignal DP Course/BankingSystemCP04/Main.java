package BankingSystemCP04;

public class Main {
    public static void main(String[] args) {
        // TODO: Use the AccountBuilder to create a BankAccount with account number
        // "123456789"
        // and balance 1000.00, and enable optional features: overdraft protection,
        // international transactions, and online banking access.

        // TODO: Print the details of the created BankAccount using
        // System.out.println(account);

        BankAccount account = new BankAccount.AccountBuilder("123456789", 1000.00)
                .withOverdraftProtection(true)
                .withInternationalTransactions(true)
                .withOnlineBankingAccess(true)
                .build();

        System.out.println(account);
    }
}
