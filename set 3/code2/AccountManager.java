import java.util.HashMap;
import java.util.Map;

class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Name: " + name + ", Balance: " + balance;
    }
}

public class AccountManager {
    private Map<Integer, Account> accounts;

    public AccountManager() {
        this.accounts = new HashMap<>();
    }

    // Method to add a new account
    public void addAccount(int accountNumber, String name, double balance) {
        if (accounts.containsKey(accountNumber)) {
            throw new IllegalArgumentException("Account with this number already exists.");
        }
        Account newAccount = new Account(accountNumber, name, balance);
        accounts.put(accountNumber, newAccount);
    }

    // Method to get the balance of an account
    public double getBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found.");
        }
        return account.getBalance();
    }

    // Method to check if an account exists
    public boolean accountExists(int accountNumber) {
        return accounts.containsKey(accountNumber);
    }

    // Method to display all accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }

    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();

        // Adding accounts
        accountManager.addAccount(1, "Alice", 5000.0);
        accountManager.addAccount(2, "Bob", 3000.0);

        // Querying balance
        System.out.println("Balance for account 1: " + accountManager.getBalance(1));

        // Verifying existence
        System.out.println("Does account 3 exist? " + accountManager.accountExists(3));

        // Displaying all accounts
        accountManager.displayAllAccounts();
    }
}
