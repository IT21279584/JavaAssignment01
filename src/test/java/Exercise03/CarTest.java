package Exercise03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void setNumDoors() {
        Car car = new Car("Toyota", "Vitz", "White", 2013, 1400000,5, 5,false);
        car.setNumDoors(5);

        assertEquals(5, car.getNumDoors());

    }

    @Test
    void setNumPassengers() {
        Car car = new Car("Toyota", "Vitz", "White", 2013, 1400000,5, 5,false);
        car.setNumPassengers(5);

        assertEquals(5, car.getNumPassengers());
    }

    @Test
    void setConvertible() {
        Car car = new Car("Toyota", "Vitz", "White", 2013, 1400000,5, 5,false);
        car.setConvertible(false);

        assertEquals(false, car.isConvertible());
    }
}