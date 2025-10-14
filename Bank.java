import java.util.*;
//Created By Ketan Rane
class Account {
    String username;
    long phone;
    String address;
    String type;
    int pin;
    double balance;
    ArrayList<String> transactions = new ArrayList<>();

    Account(String username, long phone, String address, String type, int pin, double balance) {
        this.username = username;
        this.phone = phone;
        this.address = address;
        this.type = type;
        this.pin = pin;
        this.balance = balance;
        transactions.add("Account created with initial deposit: " + balance + " rs");
    }
}

public class Bank {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();
    static Account currentUser = null;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n***** WELCOME TO LAXMI CHIT FUND *****\n");
            System.out.println("1. Create New Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("\nEnter an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("\nThank you for visiting LAXMI CHIT FUND!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void createAccount() {
        System.out.println("\n=== ACCOUNT CREATION ===");
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        for (Account acc : accounts) {
            if (acc.username.equalsIgnoreCase(username)) {
                System.out.println("Username already exists. Try a different one.");
                return;
            }
        }

        System.out.print("Enter phone number: ");
        long phone = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter account type (Savings/Current): ");
        String type = sc.next();
        System.out.print("Set 4-digit PIN: ");
        int pin = sc.nextInt();
        System.out.print("Enter initial deposit: ");
        double balance = sc.nextDouble();

        accounts.add(new Account(username, phone, address, type, pin, balance));
        System.out.println("\n✅ Account created successfully!");
    }

    static void login() {
        System.out.println("\n=== LOGIN ===");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        sc.nextLine();

        for (Account acc : accounts) {
            if (acc.username.equalsIgnoreCase(username) && acc.pin == pin) {
                currentUser = acc;
                System.out.println("\n✅ Login successful. Welcome, " + currentUser.username + "!");
                features();
                return;
            }
        }

        System.out.println("❌ Invalid username or PIN.");
    }

    static void features() {
        while (true) {
            System.out.println("\n===== ACCOUNT MENU =====");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Transfer Amount");
            System.out.println("5. View Statement");
            System.out.println("6. Edit Account");
            System.out.println("7. Loan & EMI Calculator");
            System.out.println("8. Logout");
            System.out.print("\nEnter your choice: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    statement();
                    break;
                case 6:
                    editAccount();
                    break;
                case 7:
                    loanCalculator();
                    break;
                case 8:
                    System.out.println("\nLogging out...");
                    currentUser = null;
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    static void deposit() {
        System.out.print("\nEnter amount to deposit: ");
        double amount = sc.nextDouble();
        currentUser.balance += amount;
        currentUser.transactions.add("Credited: " + amount + " rs");
        System.out.println("✅ Amount deposited successfully.");
    }

    static void withdraw() {
        System.out.print("\nEnter amount to withdraw: ");
        double amount = sc.nextDouble();
        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == currentUser.pin) {
            if (amount <= currentUser.balance) {
                currentUser.balance -= amount;
                currentUser.transactions.add("Debited: " + amount + " rs");
                System.out.println("✅ Amount withdrawn successfully.");
            } else {
                System.out.println("❌ Insufficient balance.");
            }
        } else {
            System.out.println("❌ Incorrect PIN.");
        }
    }

    static void checkBalance() {
        System.out.print("\nEnter your PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == currentUser.pin) {
            System.out.println("\n💰 Current Balance: " + currentUser.balance + " rs");
        } else {
            System.out.println("❌ Incorrect PIN.");
        }
    }

    static void transfer() {
        System.out.print("\nEnter recipient username: ");
        sc.nextLine();
        String recipientName = sc.nextLine();

        Account recipient = null;
        for (Account acc : accounts) {
            if (acc.username.equalsIgnoreCase(recipientName)) {
                recipient = acc;
                break;
            }
        }

        if (recipient == null) {
            System.out.println("❌ Recipient not found.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        if (amount <= currentUser.balance) {
            currentUser.balance -= amount;
            recipient.balance += amount;
            currentUser.transactions.add("Transferred: " + amount + " rs to " + recipient.username);
            recipient.transactions.add("Received: " + amount + " rs from " + currentUser.username);
            System.out.println("✅ Transfer successful.");
        } else {
            System.out.println("❌ Insufficient funds.");
        }
    }

    static void statement() {
        System.out.println("\n=== TRANSACTION STATEMENT ===");
        for (String entry : currentUser.transactions) {
            System.out.println(entry);
        }
        System.out.println("\nCurrent Balance: " + currentUser.balance + " rs");
    }

    static void editAccount() {
        System.out.print("\nEnter your PIN: ");
        int enteredPin = sc.nextInt();
        sc.nextLine();

        if (enteredPin != currentUser.pin) {
            System.out.println("❌ Incorrect PIN.");
            return;
        }

        System.out.println("\n=== EDIT ACCOUNT DETAILS ===");
        System.out.print("New username (leave blank to keep same): ");
        String newUsername = sc.nextLine();
        if (!newUsername.isEmpty()) currentUser.username = newUsername;

        System.out.print("New phone (leave blank to keep same): ");
        String phoneInput = sc.nextLine();
        if (!phoneInput.isEmpty()) currentUser.phone = Long.parseLong(phoneInput);

        System.out.print("New address (leave blank to keep same): ");
        String newAddress = sc.nextLine();
        if (!newAddress.isEmpty()) currentUser.address = newAddress;

        System.out.print("New account type (leave blank to keep same): ");
        String newType = sc.nextLine();
        if (!newType.isEmpty()) currentUser.type = newType;

        System.out.println("\n✅ Account updated successfully!");
    }

    static void loanCalculator() {
        System.out.println("\n=== LOAN & EMI CALCULATOR ===");
        System.out.println("1. Education Loan (6.5%)");
        System.out.println("2. Personal Loan (10.5%)");
        System.out.println("3. Home Loan (8.0%)");
        System.out.println("4. Car Loan (15.0%)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int option = sc.nextInt();

        if (option == 5) {
            return;
        }

        float rate = 0;

        if (option == 1) {
            rate = 6.5f;
        } else if (option == 2) {
            rate = 10.5f;
        } else if (option == 3) {
            rate = 8.0f;
        } else if (option == 4) {
            rate = 15.0f;
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.print("Enter loan amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter tenure (in years): ");
        int years = sc.nextInt();

        float monthlyRate = rate / (12 * 100);
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, years * 12)) /
                     (Math.pow(1 + monthlyRate, years * 12) - 1);

        System.out.println("\nLoan Details:");
        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Tenure: " + years + " years");
        System.out.println(String.format("Monthly EMI: %.2f rs", emi));
    }
}
