package Exercise01;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HobbitsTest {

    @Test
    void main() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Hobbits.main(new String[]{});

        System.setOut(System.out);
        assertEquals("frodo is a good Hobbit name\nsam is a good Hobbit name\nbilbo is a good Hobbit name" + System.lineSeparator(), outputStream.toString());
    }
}