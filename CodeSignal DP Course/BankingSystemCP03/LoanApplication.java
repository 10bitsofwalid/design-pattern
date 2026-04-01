package BankingSystemCP3;

// TODO: Implement the LoanApplication class with a method applyForLoan that accepts a LoanFactory, interestRate, and loanAmount.
// TODO: The method should use the factory to create and return the appropriate Loan instance.


public class LoanApplication {

    public Loan applyForLoan(LoanFactory factory, double interestRate, double loanAmount) {
        return factory.createLoan(interestRate, loanAmount);
    }
}
