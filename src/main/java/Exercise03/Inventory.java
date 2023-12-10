package Exercise03;

import java.util.ArrayList;

public class Inventory {

    private Vehicle[] vehicles;

    //Constructor
    public Inventory(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    //Setter
    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    //Getter
    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public double getAveragePrice(){
        double total = 0;
        double avgPrice = 0;

        for(Vehicle vehicle : vehicles){
            total = total + vehicle.getPrice();
        }

        avgPrice = total / vehicles.length;
        return avgPrice;
    }

    public Vehicle[] searchByMakeAndModel(String make, String model){
        ArrayList<Vehicle> matchVehicles = new ArrayList<>();
        try {
            for(Vehicle vehicle : vehicles){
                if(vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                    matchVehicles.add(vehicle);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return matchVehicles.toArray(new Vehicle[0]);
    }
}
