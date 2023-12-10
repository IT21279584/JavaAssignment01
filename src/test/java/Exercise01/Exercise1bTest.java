package Exercise01;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1bTest {
    @Test
    void main(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Exercise1b.main(new String[]{});

        System.setOut(System.out);
        assertEquals("small x" + System.lineSeparator(), outputStream.toString());
    }

}