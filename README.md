Console-Based Banking System

A simple and robust console-based banking application developed in Java to demonstrate core Object-Oriented Programming (OOP) concepts, account management, transaction processing, state management, and input validation.

The application allows users to create bank accounts, deposit and withdraw money, check account details and balances, and view their transaction history through an easy-to-use command-line menu.

---

✨ Features

👤 Account Creation

- Create a unique bank account.
- Store account number and account holder name.
- Set an initial deposit.
- Validate account information and deposit amount.

💰 Secure Transactions

- Deposit money into an account.
- Withdraw money from an account.
- Prevent negative or zero-value transactions.
- Prevent withdrawals that exceed the available balance.
- Automatically update the account balance after every transaction.

📊 Balance & Account Details

- View account holder information.
- Display account number.
- Check the current account balance in real time.

📜 Transaction History

- Maintain a chronological record of transactions.
- Record deposits and withdrawals.
- Display transaction details whenever requested.

🛡️ Input Validation

- Handles invalid menu choices.
- Prevents invalid monetary values.
- Prevents overdrawing the account.
- Provides meaningful error messages to the user.

---

🧠 OOP Concepts Demonstrated

This project is designed to demonstrate important Java OOP concepts:

OOP Concept| Implementation
Encapsulation| Account data is kept private and accessed through methods
Abstraction| Banking operations are represented through simple methods
Classes & Objects| "BankAccount" represents individual bank accounts
Methods| Deposit, withdrawal, balance inquiry, and history operations
State Management| Account balance and transaction history are updated dynamically
Input Validation| Invalid transactions and user inputs are handled safely

---

🛠️ Technologies Used

- Java
- Java Collections
- Object-Oriented Programming
- Java Scanner for user input
- Command Line / Terminal

Requirements

- JDK 8 or higher

Check whether Java is installed:

java -version
javac -version

---

🚀 Setup & Execution

Follow the steps below to run the project from your terminal or command prompt.

1. Clone the Repository


git clone https://github.com/sadiyahassan1674-afk/console-banking-system.git

Then move into the project directory:

cd console-banking-system

---

2. Navigate to the Source Directory

The Java source files are stored inside the "src" directory.

cd src

---

3. Compile the Java Files

Compile both Java source files:

javac BankAccount.java BankApp.java

If compilation is successful, Java ".class" files will be generated in the source directory.

---

4. Run the Application

Start the banking application using:

java BankApp

The console menu will then be displayed.

---

📂 Project Structure

console-banking-system/
│
├── src/
│ ├── BankAccount.java
│ │ └── Handles account information,
│ │ balance management, transactions,
│ │ and transaction history.
│ │
│ └── BankApp.java
│ └── Contains the main method,
│ menu system, and user input handling.
│
└── README.md
    └── Project documentation and
        execution instructions.

---

💻 Application Workflow

The application follows a simple banking workflow:

              ┌───────────────────┐
              │ Start Program │
              └─────────┬─────────┘
                        │
                        ▼
              ┌───────────────────┐
              │ Create Account │
              └─────────┬─────────┘
                        │
                        ▼
              ┌───────────────────┐
              │ Banking Menu │
              └─────────┬─────────┘
                        │
          ┌─────────────┼─────────────┐
          │ │ │
          ▼ ▼ ▼
     ┌─────────┐ ┌──────────┐ ┌──────────┐
     │ Deposit │ │ Withdraw │ │ Balance │
     └────┬────┘ └─────┬────┘ └────┬─────┘
          │ │ │
          └──────────────┼──────────────┘
                         │
                         ▼
                ┌──────────────────┐
                │ Transaction │
                │ History │
                └────────┬─────────┘
                         │
                         ▼
                ┌──────────────────┐
                │ Exit │
                └──────────────────┘

---

🧾 Example Menu

================================
       CONSOLE BANKING SYSTEM
================================

1. Deposit Money
2. Withdraw Money
3. Check Balance
4. Account Details
5. Transaction History
6. Exit

Enter your choice:

Example Transaction

Enter amount to deposit: 5000

✓ Deposit successful!
Current Balance: ₹15000.00

For an invalid withdrawal:

Enter amount to withdraw: 20000

✗ Transaction failed!
Insufficient balance.

---

🔐 Validation Rules

The application follows basic banking validation rules:

- Account number must be unique.
- Initial deposit must be valid.
- Deposit amount cannot be negative or zero.
- Withdrawal amount cannot be negative or zero.
- Withdrawal cannot exceed the available balance.
- Invalid menu selections are rejected.
- Account balance is updated after every successful transaction.
- Every successful deposit or withdrawal is added to the transaction history.

---

📜 Transaction History Example

========== TRANSACTION HISTORY ==========

1. Account created with initial deposit: ₹10000.00
2. Deposited: ₹5000.00
3. Withdrawn: ₹2000.00
4. Deposited: ₹1500.00

Current Balance: ₹14500.00

---

🎯 Project Objectives

The main objectives of this project are to:

1. Understand and implement Object-Oriented Programming in Java.
2. Apply encapsulation to protect account information.
3. Implement real-world banking operations.
4. Practice input validation and exception handling.
5. Manage changing account state.
6. Store and display transaction history.
7. Develop a functional command-line Java application.

---

🔮 Future Improvements

The project can be extended with additional features such as:

- Multiple bank accounts
- Account search by account number
- Money transfer between accounts
- PIN/password authentication
- Account deletion
- Saving account data to files
- Database integration
- Interest calculation
- Different account types
- Improved exception handling
- GUI-based banking interface

---

👨‍💻 Author

SADIYA HASSAN

Developed as a Java project for practicing Object-Oriented Programming and console-based application development.

---

📄 License

This project is created for educational purposes. You are free to modify and improve it for learning and academic use.
