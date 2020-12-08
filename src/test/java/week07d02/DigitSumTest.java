package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DigitSumTest {

    @Test

    public void testSumOfDigits() {

        assertEquals(10, new DigitSum().sumOfDigits(1234));
        assertEquals(24, new DigitSum().sumOfDigits(888));
        assertEquals(6, new DigitSum().sumOfDigits(202020));
    }



}
