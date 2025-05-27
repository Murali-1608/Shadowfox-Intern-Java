package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Bank Account System!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        BankAccount account = new BankAccount(name, 1000.0); // Starting with $1000 initial balance
        System.out.println("Hello, " + name + "! Your account has been created with balance Rs. 1000.00\n");

        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                    System.out.printf("Deposit successful! New balance: $%.2f\n\n", account.getBalance());
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    if (account.withdraw(amount)) {
                        System.out.printf("Withdrawal successful! New balance: $%.2f\n\n", account.getBalance());
                    } else {
                        System.out.println("Insufficient balance!\n");
                    }
                }
                case 3 -> {
                    System.out.printf("Current balance: $%.2f\n\n", account.getBalance());
                }
                case 4 -> {
                    System.out.println("Transaction History:");
                    int i = 1;
                    for (String transaction : account.getTransactionHistory()) {
                        System.out.println(i + ". " + transaction);
                        i++;
                    }
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("Thank you for using the Bank Account System. Goodbye!");
                    exit = true;
                }
                default -> System.out.println("Invalid choice. Please try again.\n");
            }
        }

        scanner.close();
    }
}
