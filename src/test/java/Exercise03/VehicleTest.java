package Exercise03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void setMake() {
        Vehicle vehicle = new Vehicle("Toyota", "Vitz", "Red", 2013, 100000);
        vehicle.setMake("Toyota");

        assertEquals("Toyota", vehicle.getMake());
    }

    @Test
    void setModel() {
        Vehicle vehicle = new Vehicle("Toyota", "Vitz", "Red", 2013, 100000);
        vehicle.setModel("Vitz");

        assertEquals("Vitz", vehicle.getModel());
    }

    @Test
    void setColor() {
        Vehicle vehicle = new Vehicle("Toyota", "Vitz", "Red", 2013, 100000);
        vehicle.setColor("Red");

        assertEquals("Red", vehicle.getColor());
    }

    @Test
    void setYear() {
        Vehicle vehicle = new Vehicle("Toyota", "Vitz", "Red", 2013, 100000);
        vehicle.setYear(2013);

        assertEquals(2013, vehicle.getYear());
    }

    @Test
    void setPrice() {
        Vehicle vehicle = new Vehicle("Toyota", "Vitz", "Red", 2013, 100000);
        vehicle.setPrice(100000);

        assertEquals(100000, vehicle.getPrice());
    }
}