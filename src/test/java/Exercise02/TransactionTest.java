package Exercise02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void setTransactionId() {
        Transaction transaction = new Transaction(100, "20/12/2023", "Saving", 1500);
        transaction.setTransactionId(100);

        assertEquals(100, transaction.getTransactionId());

    }

    @Test
    void setTransactionDate() {
        Transaction transaction = new Transaction(100, "20/12/2023", "Saving", 1500);
        transaction.setTransactionDate("20/12/2023");

        assertEquals("20/12/2023", transaction.getTransactionDate());
    }

    @Test
    void setTransactionType() {
        Transaction transaction = new Transaction(100, "20/12/2023", "Saving", 1500);
        transaction.setTransactionType("Saving");

        assertEquals("Saving", transaction.getTransactionType());
    }

    @Test
    void setTransactionAmount() {
        Transaction transaction = new Transaction(100, "20/12/2023", "Saving", 1500);
        transaction.setTransactionAmount(1500);

        assertEquals(1500, transaction.getTransactionAmount());
    }
}