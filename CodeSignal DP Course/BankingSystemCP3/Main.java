package BankingSystemCP3;

public class Main {
    public static void main(String[] args) {
        // TODO: Use the LoanApplication class to apply for a HomeLoan and CarLoan

        // TODO: Print the details of each loan using the loanDetails() method.
        
        LoanApplication application = new LoanApplication();

        Loan homeLoan = application.applyForLoan(new HomeLoanFactory(), 3.5, 250000.00);
        homeLoan.loanDetails();

        Loan carLoan = application.applyForLoan(new CarLoanFactory(), 5.2, 30000.00);
        carLoan.loanDetails();

    }
}