package Exercise03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    @Test
    void setBedLength() {
        Truck truck1 = new Truck("Revo", "Gory", "Gray", 2008, 450000, 14, 78);
        truck1.setBedLength(14);

        assertEquals(14, truck1.getBedLength());
    }

    @Test
    void setPayloadCapacity() {
        Truck truck1 = new Truck("Revo", "Gory", "Gray", 2008, 450000, 14, 78);
        truck1.setPayloadCapacity(78);

        assertEquals(78, truck1.getPayloadCapacity());
    }
}