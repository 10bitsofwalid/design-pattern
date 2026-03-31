package BankingSystemCP3;

// TODO: Define an interface LoanFactory with a method createLoan(double interestRate, double loanAmount).


public interface LoanFactory {
    Loan createLoan(double interestRate, double loanAmount);
}