package week06d05;

import org.junit.jupiter.api.Test;
import week06d05.Biscuit;
import week06d05.BiscuitType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiscuitTest {

    @Test
    public void testNewBiscuit() {
        Biscuit keksz = new Biscuit(BiscuitType.PILOTA, 100);

        assertEquals( 100,keksz.getGramAmount());
        assertEquals( BiscuitType.PILOTA,keksz.getType());
    }


}
