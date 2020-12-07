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

        assertEquals( true, new MathAlgorithms().isPrime(2));
        assertEquals( true, new MathAlgorithms().isPrime(3));
        assertEquals( true, new MathAlgorithms().isPrime(5));
        assertEquals( true, new MathAlgorithms().isPrime(7));
    }

    @Test

    public void testIsPrimeNotPrime() {

        assertEquals( false, new MathAlgorithms().isPrime(4));
        assertEquals( false, new MathAlgorithms().isPrime(6));
        assertEquals( false, new MathAlgorithms().isPrime(24));
        assertEquals( false, new MathAlgorithms().isPrime(45));
    }


}
