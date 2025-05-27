package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setup() {
        account = new BankAccount("Alice", 1000.0);
    }

    @Test
    public void testInitialBalance() {
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    public void testDeposit() {
        account.deposit(250.0);
        assertEquals(1250.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.withdraw(100.0);
        assertEquals(900.0, account.getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000.0);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    public void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50.0);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    public void testWithdrawalNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-30.0);
        });
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }

    @Test
    public void testTransactionHistory() {
        account.deposit(200.0);
        account.withdraw(100.0);
        List<String> history = account.getTransactionHistory();

        assertTrue(history.contains("Account created with balance: $1000.0"));
        assertTrue(history.contains("Deposited: $200.0"));
        assertTrue(history.contains("Withdrew: $100.0"));
    }
}
