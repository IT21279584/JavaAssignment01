package Exercise03;

public class Truck extends Vehicle{

    private int bedLength;
    private double payloadCapacity;

    //Constructor
    public Truck(String make, String model, String color, int year, double price, int bedLength, double payloadCapacity) {
        super(make, model, color, year, price);
        this.bedLength = bedLength;
        this.payloadCapacity = payloadCapacity;
    }

    //Setters
    public void setBedLength(int bedLength) {
        this.bedLength = bedLength;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    //Getters
    public int getBedLength() {
        return bedLength;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }
}
