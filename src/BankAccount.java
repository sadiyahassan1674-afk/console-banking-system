import java.util.ArrayList;
import java.util.List;


// BankAccount class encapsulating data and operations
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with initial balance: $" + initialDeposit);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: $" + amount + " | New Balance: $" + balance);
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount + " | New Balance: $" + balance);
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayHistory() {
        System.out.println("\n--- Transaction History for Account: " + accountNumber + " ---");
        for (String record : transactionHistory) {
            System.out.println("- " + record);
        }
    }

    public void displayAccountInfo() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}


