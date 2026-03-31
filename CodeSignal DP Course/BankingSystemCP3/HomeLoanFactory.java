package BankingSystemCP3;

// TODO: Create a class HomeLoanFactory that implements LoanFactory.
// TODO: Implement the createLoan method to return a new instance of HomeLoan.


public class HomeLoanFactory implements LoanFactory {

    @Override
    public Loan createLoan(double interestRate, double loanAmount) {
        return new HomeLoan(interestRate, loanAmount);
    }
}