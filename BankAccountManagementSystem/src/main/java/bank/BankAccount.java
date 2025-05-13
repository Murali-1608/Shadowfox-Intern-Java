package main.java.bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final String accountHolder;
    private double balance;
    private final List<Transaction> transactionHistory;

    public BankAccount(String accountHolder, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add(new Transaction("Account Created", initialDeposit));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdrawal", amount));
            return true;
        } else {
            transactionHistory.add(new Transaction("Failed Withdrawal", amount));
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
