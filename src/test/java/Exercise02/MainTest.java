package Exercise02;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testIsEmailValid(){

        String email = "hansaka@gmail.com";
        boolean result = Main.isEmail(email);

        assertTrue(result, "hansaka@gmail.com");
    }

    @Test
    void testMain(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(new String[]{});

        System.setOut(System.out);
        assertEquals("Average price of vehicles : 705000.0\n" +
                "Vehicle make with Toyota and model with Vitz\n" +
                "The Result is match make with Toyota and model with Vitz" + System.lineSeparator(), outputStream.toString());

    }

}