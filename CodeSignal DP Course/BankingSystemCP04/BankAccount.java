package BankingSystemCP04;

public class BankAccount {
    private final String accountNumber;
    private final double balance;
    private final boolean hasOverdraftProtection;
    private final boolean allowsInternationalTransactions;
    private final boolean hasOnlineBankingAccess;

    // Constructor that initializes all fields using the AccountBuilder
    private BankAccount(AccountBuilder builder) {
        this.accountNumber = builder.accountNumber;
        this.balance = builder.balance;
        this.hasOverdraftProtection = builder.hasOverdraftProtection;
        this.allowsInternationalTransactions = builder.allowsInternationalTransactions;
        this.hasOnlineBankingAccess = builder.hasOnlineBankingAccess;
    }

    // TODO: Implement the AccountBuilder static inner class.
    // 1. AccountBuilder should have a constructor with parameters accountNumber and
    // balance.
    // 2. Implement methods to set the optional features:
    // withOverdraftProtection(boolean hasOverdraftProtection),
    // withInternationalTransactions(boolean allowsInternationalTransactions), and
    // withOnlineBankingAccess(boolean hasOnlineBankingAccess).
    // 3. Ensure these methods return an instance of AccountBuilder for method
    // chaining.
    // 4. Implement the build() method to return a new BankAccount instance using
    // the builder.

    public static class AccountBuilder {

        private final String accountNumber;
        private final double balance;

        private boolean hasOverdraftProtection = false;
        private boolean allowsInternationalTransactions = false;
        private boolean hasOnlineBankingAccess = false;

        public AccountBuilder(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public AccountBuilder withOverdraftProtection(boolean hasOverdraftProtection) {
            this.hasOverdraftProtection = hasOverdraftProtection;
            return this;
        }

        public AccountBuilder withInternationalTransactions(boolean allowsInternationalTransactions) {
            this.allowsInternationalTransactions = allowsInternationalTransactions;
            return this;
        }

        public AccountBuilder withOnlineBankingAccess(boolean hasOnlineBankingAccess) {
            this.hasOnlineBankingAccess = hasOnlineBankingAccess;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance +
                ", Overdraft Protection=" + hasOverdraftProtection +
                ", International Transactions=" + allowsInternationalTransactions +
                ", Online Banking Access=" + hasOnlineBankingAccess + "]";
    }
}