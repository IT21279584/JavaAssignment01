package Exercise02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void testDepost(){
        BankAccount bankAccount = new BankAccount(100,"Hansaka", "Saving", 15000);
        bankAccount.deposit(5000);

        assertEquals(20000, bankAccount.getBalance());
    }

    @Test
    void testWithdraw(){
        BankAccount bankAccount = new BankAccount(100,"Hansaka", "Saving", 15000);
        bankAccount.withdraw(5000);

        assertEquals(10000, bankAccount.getBalance());
    }

    @Test
    void testInvalidWithdraw(){
        BankAccount bankAccount = new BankAccount(100,"Hansaka", "Saving", 2000);
        bankAccount.withdraw(5000);

        assertEquals(2000, bankAccount.getBalance());
    }

}