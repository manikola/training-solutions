package week06d05.senior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BottleTest {



    @Test
    public void testFull() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Bottle(BottleType.PET_BOTTLE, 14).fill(1500);
        });
        assertEquals("Overflowed!", ex.getMessage());
    }
}
