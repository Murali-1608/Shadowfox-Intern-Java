package main.java.bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to the Bank Account Management System ");

        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ₹");
        double initialDeposit = scanner.nextDouble();
        BankAccount account = new BankAccount(name, initialDeposit);

        int choice;
        do {
            System.out.println("\n===============================");
            System.out.println("1️ Deposit");
            System.out.println("2️ Withdraw");
            System.out.println("3️ Check Balance");
            System.out.println("4️ Transaction History");
            System.out.println("5️ Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    System.out.println(" Deposit successful!");
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = scanner.nextDouble();
                    if (account.withdraw(withdraw)) {
                        System.out.println(" Withdrawal successful!");
                    } else {
                        System.out.println("X Insufficient balance!");
                    }
                    break;

                case 3:
                    System.out.printf("# Current Balance: ₹%.2f%n", account.getBalance());
                    break;

                case 4:
                    System.out.println("|| Transaction History:");
                    for (Transaction t : account.getTransactionHistory()) {
                        System.out.println(t);
                    }
                    break;

                case 5:
                    System.out.println(" Thank you for using our system!");
                    break;

                default:
                    System.out.println("X Invalid choice. Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
