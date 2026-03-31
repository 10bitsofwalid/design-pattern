package BankingSystemCP3;

// TODO: Create a class HomeLoan that extends Loan.
// TODO: Implement the constructor for HomeLoan to initialize interestRate and loanAmount.
// TODO: Override the loanDetails() method to print loan details for HomeLoan.

public class HomeLoan extends Loan {

    public HomeLoan(double interestRate, double loanAmount) {
        super(interestRate, loanAmount);
    }

    @Override
    public void loanDetails() {
        System.out.println("Home Loan Details:");
        System.out.println("  Interest Rate: " + interestRate + "%");
        System.out.println("  Loan Amount: $" + loanAmount);
    }
}