import org.example.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void arrayOfOddIntegers_returnEmptyArray_WhenNIsNegative(){
        List<Integer> numbers= Main.arrayOfOddIntegers(-5);
        assertTrue(numbers.isEmpty());
    }
    @Test
    void arrayOfOddIntegers_returnEmptyArray_WhenNIs0(){
        List<Integer> numbers= Main.arrayOfOddIntegers(0);
        assertTrue(numbers.isEmpty());
    }
    @Test
    void arrayOfOddIntegers_returnArrayUptoN(){
        List<Integer> numbers= Main.arrayOfOddIntegers(9);
        assertEquals( List.of(1, 3, 5, 7, 9), numbers);
    }
    @Test
    void arrayOfOddIntegers_returnArrayWithOneWhenNisOne(){
        List<Integer> numbers= Main.arrayOfOddIntegers(1);
        assertEquals( List.of(1), numbers);
    }
    @Test
    void containsJavaKeyword_returnsTrue_WhenTextContainsKeyword(){
        assertTrue(Main.containsJavaKeyword("final is a java keyword"));
    }
    @Test
    void containsJavaKeyword_returnsFalse_WhenTextDoesNotContainKeyword(){
        assertFalse(Main.containsJavaKeyword("hello is a java keyword"));
    }
    @Test
    void containsJavaKeyword_returnsFalse_WhenTextIsEmpty(){
        assertFalse(Main.containsJavaKeyword(""));
    }
    @Test
    void containsJavaKeyword_returnsFalse_WhenTextIsNull(){
        assertFalse(Main.containsJavaKeyword(null));
    }

}
