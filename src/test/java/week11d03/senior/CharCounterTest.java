package week11d03.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    @Test
    void countChars() {
        CharCounter cc = new CharCounter();
        String[] arr = new String[] {"abc", "cba", "ab"};
        assertEquals(2,cc.countChars(arr));
    }
}