package Exercise04;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequencyCalculatorTest {

    @Test
    public void main(){
        String word = "hello world";
        InputStream in = new ByteArrayInputStream(word.getBytes());
        System.setIn(in);

        Map<Character, Integer>  characterFrequencyMap = new HashMap<>();

        assertEquals(1, characterFrequencyMap.get('h'));
        assertEquals(1, characterFrequencyMap.get('e'));
        assertEquals(3, characterFrequencyMap.get('l'));
        assertEquals(2, characterFrequencyMap.get('o'));
        assertEquals(1, characterFrequencyMap.get(' '));
        assertEquals(1, characterFrequencyMap.get('w'));
        assertEquals(1, characterFrequencyMap.get('r'));
        assertEquals(1, characterFrequencyMap.get('d'));
    }
}
