package BankingSystemCP3;

// TODO: Define an abstract class Loan with protected fields for interestRate and loanAmount.
// TODO: Implement a constructor to initialize these fields.
// TODO: Add an abstract method named loanDetails().

public abstract class Loan {
    // Define fields and methods based on the TODO comments
    
    protected double interestRate;
    protected double loanAmount;

    public Loan(double interestRate, double loanAmount) {
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
    }

    public abstract void loanDetails();
}
