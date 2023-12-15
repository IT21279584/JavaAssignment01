package Exercise02;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Bank {
    static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private List<Customer> customers;
    private List<BankAccount> bankAccounts;

    public Bank(){
        this.customers = new ArrayList<>();
        this.bankAccounts = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
        logger.info("Customer added: " + customer.getCustomerName());
    }

    public void removeCustomer(Customer customer){
        customers.remove(customer);
        logger.info("Customer removed: " + customer.getCustomerName());
    }

    public void addBankAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);
        logger.info("BankAccount added: " + bankAccount.getName());
    }

    public void removeBankAccount(BankAccount bankAccount){
        bankAccounts.remove(bankAccount);
        logger.info("BankAccount removed: " + bankAccount.getName());
    }

    public void displayCustomerDetails(){
        System.out.println("-----Customer Details-----");
        for(Customer customer: customers){
            System.out.println("Customer ID: " +customer.getcId());
            System.out.println("Customer Name: " +customer.getCustomerName());
            System.out.println("Customer Email: " +customer.getCustomerEmail());
            System.out.println("Customer Phone: " +customer.getPhone());
            System.out.println();
        }
    }

    public void displayBankAccountDetails(){
        System.out.println("-----BankAccount Details-----");
        for(BankAccount bankAccount: bankAccounts){
            System.out.println("BankAccount Number: " +bankAccount.getAccNo());
            System.out.println("BankAccount Holder: " +bankAccount.getName());
            System.out.println("BankAccount Type: " +bankAccount.getType());
            System.out.println("BankAccount Balance: " +bankAccount.getBalance());
            System.out.println();
        }
    }

    public void viewCustomers(){
        System.out.println("-----Customers List-----");
        for(Customer customer: customers){
            System.out.println("customer ID: " +customer.getcId());
            System.out.println();
        }
    }

    public void viewBankAccounts(){
        System.out.println("-----Bank Account List-----");
        for(BankAccount bankAccount: bankAccounts){
            System.out.println("Bank ID: " +bankAccount.getAccNo());
            System.out.println();
        }
    }


}
