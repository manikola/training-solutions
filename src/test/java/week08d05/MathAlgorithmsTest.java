package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {

    @Test
    public void testGreatestCommonDivisor() {

        assertEquals(15, MathAlgorithms.greatestCommonDivisor(30, 60));
    }
}
