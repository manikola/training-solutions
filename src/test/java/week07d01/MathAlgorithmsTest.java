package week07d01;

import org.junit.jupiter.api.Test;
import week05d05.User;

import static org.junit.jupiter.api.Assertions.*;

public class MathAlgorithmsTest {

    @Test
    public void testIsPrimeNegative() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new MathAlgorithms().isPrime(-33));
        assertEquals("Number has to be positive!", ex.getMessage());

    }
    @Test

    public void testIsPrimePrime() {


        assertTrue(new MathAlgorithms().isPrime(2));
        assertTrue(new MathAlgorithms().isPrime(3));
        assertTrue(new MathAlgorithms().isPrime(5));

    }

    @Test

    public void testIsPrimeNotPrime() {

        assertFalse(new MathAlgorithms().isPrime(4));
        assertFalse(new MathAlgorithms().isPrime(6));
        assertFalse(new MathAlgorithms().isPrime(12));
        assertFalse(new MathAlgorithms().isPrime(1));


    }


}
