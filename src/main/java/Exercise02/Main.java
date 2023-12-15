package Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args){
        try{
            Bank bank = new Bank();

            Scanner sc = new Scanner(System.in);
            System.out.println("-----Enter Customer Details-----");

            do{
                try{
                    System.out.println("Enter Customer ID: ");
                    int customerId = sc.nextInt();
                    System.out.println("Enter Customer Name: ");
                    String customerName = sc.next();
                    System.out.println("Enter Customer Email: ");
                    String customerEmail = sc.next();
                    System.out.println("Enter Customer Phone: ");
                    String customerPhone = sc.next();

                    Customer customer = new Customer(customerId, customerName, customerEmail, customerPhone);
                    bank.addCustomer(customer);

                    System.out.println("-----Enter Bank Account Details-----");

                    System.out.println("Enter Bank Account Number: ");
                    int bankAccountNo = sc.nextInt();
                    System.out.println("Enter Holder Name: ");
                    String holderName = sc.next();
                    System.out.println("Enter BankAccount Type: ");
                    String accountType = sc.next();
                    System.out.println("Enter BankAccount Balance: ");
                    float accountBalance = sc.nextFloat();

                    BankAccount bankAccount = new BankAccount(bankAccountNo,holderName,accountType, accountBalance);
                    bank.addBankAccount(bankAccount);

                    if(accountBalance < 0){
                        logger.info("Invalid Initial Balance. Please a correct value");
                        return;
                    }

                    bank.displayCustomerDetails();
                    bank.displayBankAccountDetails();

                    while(true){
                        System.out.println("\nChoose an action");
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Transaction History");
                        System.out.println("4. Exit");

                        System.out.println("Enter your Choice");
                        int choice = sc.nextInt();

                        switch (choice){
                            case 1:
                                System.out.println("Enter your deposit amount : ");
                                float deposit = sc.nextFloat();
                                bankAccount.deposit(deposit);
                                break;
                            case 2:
                                System.out.println("Enter your withdraw amount : ");
                                float withdraw = sc.nextFloat();
                                bankAccount.withdraw(withdraw);
                                break;
                            case 3:
                                bankAccount.viewTransactionHistory();
                                break;
                            case 4:
                                logger.info("Thank You");
                                sc.close();
                                System.exit(0);
                                break;
                            default:
                                logger.info("Invalid Choice. Please enter valid choice!!");
                        }
                    }
                }catch(InputMismatchException e){
                    System.out.println(e);
                }
            }while(false);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static boolean isEmail(String customerEmail){
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(customerEmail);
        return  match.matches();
    }
}
