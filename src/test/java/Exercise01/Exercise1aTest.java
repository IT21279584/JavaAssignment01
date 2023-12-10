package Exercise01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1aTest {

    @Test
    void main() {
        //direct capture the output of the Exercise1a
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //call the main method of the Exercise1a
        Exercise1a.main(new String[]{});

        //reset System.out to the original printstream
        System.setOut(System.out);

        String expectValue = "big x\nbig x\nbig x\nbig x\nbig x\nbig x\n";
        Assertions.assertEquals(expectValue, outputStream.toString());
    }
}