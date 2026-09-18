import java.util.HashMap;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        HashMap<String, BankAccount> accounts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Console Banking System ===");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance & Details");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number (1-6): ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNum = scanner.nextLine();
                    if (accounts.containsKey(accNum)) {
                        System.out.println("Error: Account number already exists!");
                        break;
                    }
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Initial Deposit Amount: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.print("Invalid amount. Enter a valid number: ");
                        scanner.next();
                    }
                    double initDeposit = scanner.nextDouble();
                    scanner.nextLine();

                    BankAccount newAccount = new BankAccount(accNum, name, initDeposit);
                    accounts.put(accNum, newAccount);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    BankAccount depAcc = findAccount(accounts, scanner);
                    if (depAcc != null) {
                        System.out.print("Enter amount to deposit: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.print("Invalid amount. Enter a valid number: ");
                            scanner.next();
                        }
                        double depAmount = scanner.nextDouble();
                        scanner.nextLine();
                        depAcc.deposit(depAmount);
                    }
                    break;

                case 3:
                    BankAccount witAcc = findAccount(accounts, scanner);
                    if (witAcc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.print("Invalid amount. Enter a valid number: ");
                            scanner.next();
                        }
                        double witAmount = scanner.nextDouble();
                        scanner.nextLine();
                        witAcc.withdraw(witAmount);
                    }
                    break;

                case 4:
                    BankAccount checkAcc = findAccount(accounts, scanner);
                    if (checkAcc != null) {
                        checkAcc.displayAccountInfo();
                    }
                    break;

                case 5:
                    BankAccount histAcc = findAccount(accounts, scanner);
                    if (histAcc != null) {
                        histAcc.displayHistory();
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the Console Banking System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Please choose between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static BankAccount findAccount(HashMap<String, BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        BankAccount account = accounts.get(accNum);
        if (account == null) {
            System.out.println("Error: Account not found!");
        }
        return account;
    }
}

