package Exercise01;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1cTest {
    @Test
    void main(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Exercise1c.main(new String[]{});

        System.setOut(System.out);
        assertEquals("small x" + System.lineSeparator(), outputStream.toString());
    }

}