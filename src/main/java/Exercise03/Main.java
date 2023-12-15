package Exercise03;

import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args){

        Car car1 = new Car("Toyota", "Vitz", "White", 2013, 1400000,5, 5,false);
        Car car2 = new Car("Suzuki", "Alto", "red", 2014, 850000, 5, 5, true);
        Truck truck1 = new Truck("Revo", "Gory", "Gray", 2008, 450000, 14, 78);
        Truck truck2 = new Truck("CPS", "Rego", "blue", 1998, 120000, 15, 150);

        Vehicle[] vehicleList = {car1, car2, truck1, truck2};

        Inventory inventory = new Inventory(vehicleList);

        logger.info("Average price of vehicles : "+inventory.getAveragePrice());

        String searchMake = "Toyota";
        String searchModel = "Vitz";
        Vehicle[] searchVehicles = inventory.searchByMakeAndModel(searchMake, searchModel);

        logger.info("Vehicle make with "+searchMake+" and model with "+searchModel);

        for(Vehicle searchVehicle : searchVehicles){
            logger.info("The Result is match make with "+searchVehicle.getMake()+" and model with "+ searchVehicle.getModel());
        }
    }
}
