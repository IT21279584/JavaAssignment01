package Exercise02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private int accNo;
    private String name;
    private String type;
    private float balance;
    private List<Transaction> transactionsHistory;

    //Constructor
    public BankAccount(int accNo, String name, String type, float balance){

        this.accNo = accNo;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.transactionsHistory = new ArrayList<>();
    }

    //Setters
    public void setAccNo(int accNo){
        this.accNo = accNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    //Getters
    public int getAccNo(){
        return accNo;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public float getBalance(){
        return balance;
    }

    public void deposit(float amount){
        try{
            if(amount > 0){
                balance += amount;
                recordTransactions("Deposit", amount);
                System.out.println("Deposit Successful. New Balance is : " + balance);
            }else{
                throw new Exception("Invalid Data");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void withdraw(float amount){

        try{
            if(balance > 0 && amount <= balance){
                balance -= amount;
                recordTransactions("Withdraw", amount);
                System.out.println("Withdraw Successful. New Balance is : " + balance);
            }else{
                throw new Exception("Invalid withdraw amount or Insufficient Balance");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    //View Transactions
    public void viewTransactionHistory(){
        System.out.println("-----Transaction History of " +accNo);
        for(Transaction transaction: transactionsHistory){
            System.out.println("Transaction ID: " +transaction.getTransactionId());
            System.out.println("Transaction Date: " +transaction.getTransactionDate());
            System.out.println("Transaction Type: " +transaction.getTransactionType());
            System.out.println("Transaction Amount: " +transaction.getTransactionAmount());
            System.out.println();
        }
    }

    //Record Transactions
    public void recordTransactions(String transactionType, float transactionAmount){
        int transactionId = transactionsHistory.size() + 1;
        Date transactionDate = new Date();
        Transaction transaction = new Transaction(transactionId, transactionDate.toString(), transactionType, transactionAmount);
        transactionsHistory.add(transaction);
    }
}
