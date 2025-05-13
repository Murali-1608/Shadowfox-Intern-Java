package test.java.bank;

import main.java.bank.BankAccount;
import main.java.bank.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setup() {
        account = new BankAccount("Test User", 1000);
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testWithdrawSuccess() {
        assertTrue(account.withdraw(400));
        assertEquals(600, account.getBalance());
    }

    @Test
    public void testWithdrawFailure() {
        assertFalse(account.withdraw(2000));
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testTransactionHistory() {
        account.deposit(100);
        account.withdraw(50);
        List<Transaction> history = account.getTransactionHistory();
        assertEquals(3, history.size()); // Account created + 2 transactions
    }
}
