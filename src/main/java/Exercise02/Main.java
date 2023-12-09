package Exercise02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Bank bank = new Bank();

        Scanner sc = new Scanner(System.in);
        System.out.println("-----Enter Customer Details-----");

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
            System.out.println("Invalid Initial Balance. Please a correct value");
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
                    System.out.println("Thank You");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice. Please enter valid choice!!");
<<<<<<< HEAD
            }
        }
    }
=======


            }
        }


    }

>>>>>>> origin/main
}