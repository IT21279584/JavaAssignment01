package Exercise03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    void searchByMakeAndModel() {

        Car car1 = new Car("Toyota", "Vitz", "White", 2013, 1400000,5, 5,false);
        Car car2 = new Car("Suzuki", "Alto", "red", 2014, 850000, 5, 5, true);
        Truck truck1 = new Truck("Revo", "Gory", "Gray", 2008, 450000, 14, 78);
        Truck truck2 = new Truck("CPS", "Rego", "blue", 1998, 120000, 15, 150);

        Vehicle[] vehicleList = {car1, car2, truck1, truck2};

        Inventory inventory = new Inventory(vehicleList);

        String searchMake = "Toyota";
        String searchModel = "Vitz";
        Vehicle[] searchVehicles = inventory.searchByMakeAndModel(searchMake, searchModel);

        Vehicle[] expect = {car1};

        assertArrayEquals(expect, searchVehicles);
    }
}