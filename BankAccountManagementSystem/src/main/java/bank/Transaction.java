package main.java.bank;

import java.time.LocalDateTime;

public class Transaction {
    private final String type;
    private final double amount;
    private final LocalDateTime timestamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public String toString() {
        return String.format("[%s] %s: ₹%.2f", timestamp, type, amount);
    }
}
