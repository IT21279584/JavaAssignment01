package Exercise02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void setcId() {
        Customer customer = new Customer(100, "Hansaka", "hansaka@gmail.com", "0771152428");
        customer.setcId(100);

        assertEquals(100, customer.getcId());
    }

    @Test
    void setCustomerName() {
        Customer customer = new Customer(100, "Hansaka", "hansaka@gmail.com", "0771152428");
        customer.setCustomerName("Hansaka");

        assertEquals("Hansaka", customer.getCustomerName());
    }

    @Test
    void setCustomerEmail() {
        Customer customer = new Customer(100, "Hansaka", "hansaka@gmail.com", "0771152428");
        customer.setCustomerEmail("hansaka@gmail.com");

        assertEquals("hansaka@gmail.com", customer.getCustomerEmail());
    }

    @Test
    void setPhone() {
        Customer customer = new Customer(100, "Hansaka", "hansaka@gmail.com", "0771152428");
        customer.setPhone("0771152428");

        assertEquals("0771152428", customer.getPhone());
    }
}