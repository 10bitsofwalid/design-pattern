package BankingSystemCP03;

// TODO: Create a class CarLoanFactory that implements LoanFactory.

// TODO: Implement the createLoan method to return a new instance of CarLoan.

public class CarLoanFactory implements LoanFactory {

    @Override
    public Loan createLoan(double interestRate, double loanAmount) {
        return new CarLoan(interestRate, loanAmount);
    }
}