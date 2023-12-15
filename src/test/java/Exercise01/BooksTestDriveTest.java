package Exercise01;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BooksTestDriveTest {
    @Test
    void main(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        BooksTestDrive.main(new String[]{});

        String expect = "The Grapes of Java by bob\n" +
                "The Java Gatsby by sue\n" +
                "The Java Cookbook by ian";
        System.setOut(System.out);
        assertEquals(expect + System.lineSeparator(), outputStream.toString());
    }

}