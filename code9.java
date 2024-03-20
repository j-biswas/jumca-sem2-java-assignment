import java.util.*;
public class code9 {
    private static double interestRate = 0.05; 
    private String acctNumber;
    private double balance;
    
    public code9(String acctNumber, double balance) {
        this.acctNumber = acctNumber;
        this.balance = balance;
    }
    
    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }
    
    public static double getInterestRate() {
        return interestRate;
    }
    
    public String getAcctNumber() {
        return acctNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double calculateInterest() {
        return balance * interestRate;
    }
    
    public static void main(String[] args) {
        code9 acct1 = new code9("123456", 1000);
        System.out.println("Account balance: " + acct1.getBalance());
        System.out.println("Interest rate: " + code8.getInterestRate());
        
        code9.setInterestRate(0.06);
        System.out.println("New interest rate: " + code8.getInterestRate());
        
        System.out.println("Interest earned: " + acct1.calculateInterest());
    }
}
