package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberListTest {

    @Test

    public void testIsIncreasingFalse() {
        NumberList nl = new NumberList();

        assertFalse(nl.isIncreasing(Arrays.asList(1,2,3,99,56,77)));
        assertTrue(nl.isIncreasing(Arrays.asList(1,2,3,3,34,56,77)));
        assertTrue(nl.isIncreasing(Arrays.asList(1,2,3,3,4,4, 5,66)));
    }


}
