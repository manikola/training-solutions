package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberListTest {

    @Test

    public void testIsIncreasingFalse() {
        NumberList numberList = new NumberList();
        List<Integer> numbers = Arrays.asList(1,2,3,99,56,77);

        assertFalse(new NumberList().isIncreasing(numbers));
    }

    @Test
    public void testIsIncreasingTrue() {
        NumberList numberList = new NumberList();
        List<Integer> numbers = Arrays.asList(1,2,3,3,34,56,77);

        assertFalse(new NumberList().isIncreasing(numbers));
    }
}
