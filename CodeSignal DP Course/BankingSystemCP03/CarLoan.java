package BankingSystemCP03;

// TODO: Create a class CarLoan that extends Loan.

// TODO: Implement the constructor for CarLoan to initialize interestRate and loanAmount.
// TODO: Override the loanDetails() method to print loan details for CarLoan.

public class CarLoan extends Loan {

    public CarLoan(double interestRate, double loanAmount) {
        super(interestRate, loanAmount);
    }

    @Override
    public void loanDetails() {
        System.out.println("Car Loan Details:");
        System.out.println("  Interest Rate: " + interestRate + "%");
        System.out.println("  Loan Amount: $" + loanAmount);
    }
}
