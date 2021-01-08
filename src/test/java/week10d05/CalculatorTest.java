package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test

    public void testFindMinSum() {
        int [] numbers = new int[] {10,9,8,7,6,5,4,3,2,1,1,1};
        assertEquals(5,Calculator.findMinSum(numbers));
    }
}
