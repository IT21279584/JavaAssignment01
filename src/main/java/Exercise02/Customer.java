package Exercise02;

public class Customer {
    private int cId;
    private String customerName;
    private String customerEmail;
    private String phone;

    //Constructor
    public Customer(int cId, String customerName, String customerEmail, String phone) {
        this.cId = cId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phone = phone;
    }

    //Setters
    public void setcId(int cId) {
        this.cId = cId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Getters
    public int getcId() {
        return cId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getPhone() {
        return phone;
    }
}
