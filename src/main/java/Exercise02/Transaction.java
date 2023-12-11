package Exercise02;

public class Transaction {
    private int transactionId;
    private String transactionDate;
    private String transactionType;
    private float transactionAmount;

    //Constructor
    public Transaction(int transactionId, String transactionDate, String transactionType, float transactionAmount) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }

    //Setters
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    //Getters
    public int getTransactionId() {
        return transactionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public float getTransactionAmount() {
        return transactionAmount;
    }
}
