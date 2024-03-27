
class BankCustomer {
    private int c_id;
    private String c_name;
    private double c_loan;
    private String c_phn;

    private double creditLimit;
    private boolean isPrivileged;

    public BankCustomer(int c_id, String c_name, double c_loan, String c_phn, boolean isPrivileged) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_loan = c_loan;
        this.c_phn = c_phn;
        this.isPrivileged = isPrivileged;

        if(isPrivileged) this.creditLimit=10000;
            else this.creditLimit=5000;
    }

    public void changeName(String newName) {
        this.c_name = newName;
    }

    public void changePhoneNumber(String newPhoneNumber) {
        this.c_phn = newPhoneNumber;
    }

    public boolean requestLoan(double loanAmount) {
        if (c_loan + loanAmount <= creditLimit) {
            c_loan += loanAmount;
            return true;
        }
        return false;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCurrentLoanAmount() {
        return c_loan;
    }

    public double getMaxLoanAmount() {
        return creditLimit - c_loan;
    }
}

public class code1 {
    public static void main(String[] args) {                                                                                                                                
        
        BankCustomer customer1 = new BankCustomer(1, "Joy", 1000, "123456789",  false);
        BankCustomer customer2 = new BankCustomer(2, "Ankan", 8000, "987654321", true);

        System.out.println("Customer 1:");
        System.out.println("Credit Limit: " + customer1.getCreditLimit());
        System.out.println("Current Loan Amount: " + customer1.getCurrentLoanAmount());
        System.out.println("Max Loan Amount: " + customer1.getMaxLoanAmount());

        System.out.println("\nCustomer 2:");
        System.out.println("Credit Limit: " + customer2.getCreditLimit());
        System.out.println("Current Loan Amount: " + customer2.getCurrentLoanAmount());
        System.out.println("Max Loan Amount: " + customer2.getMaxLoanAmount());

       



        double loanAmountRequested = 3000;
        if (customer1.requestLoan(loanAmountRequested)) {
            System.out.println("\nLoan of " + loanAmountRequested + " approved for Customer 1.");
            System.out.println("New Current Loan Amount: " + customer1.getCurrentLoanAmount());
            System.out.println("New Max Loan Amount: " + customer1.getMaxLoanAmount());
        } else {
            System.out.println("\nLoan request of " + loanAmountRequested + " denied for Customer 1.");
        }




        if (customer2.requestLoan(loanAmountRequested)) {
            System.out.println("\nLoan of " + loanAmountRequested + " approved for Customer 2.");
            System.out.println("New Current Loan Amount: " + customer2.getCurrentLoanAmount());
            System.out.println("New Max Loan Amount: " + customer2.getMaxLoanAmount());
        } else {
            System.out.println("\nLoan request of " + loanAmountRequested + " denied for Customer 2.");
        }
    }
}
