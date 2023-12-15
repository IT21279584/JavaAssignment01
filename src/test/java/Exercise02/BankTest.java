package Exercise02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BankTest {

    @Test
    void addCustomer() {
        Bank bank = new Bank();
        Customer customer = new Customer(100, "Hansaka", "haansaka@gmail.com", "0771152428");

        bank.addCustomer(customer);
    }

    @Test
    void removeCustomer() {
        Bank bank = new Bank();
        Customer customer = new Customer(100, "Hansaka", "haansaka@gmail.com", "0771152428");

        bank.removeCustomer(customer);
    }

    @Test
    void addBankAccount() {
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount(100200, "Hansaka", "Saving", 5000);
        bank.addBankAccount(bankAccount);
    }

    @Test
    void removeBankAccount() {
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount(100200, "Hansaka", "Saving", 5000);
        bank.removeBankAccount(bankAccount);
    }
}