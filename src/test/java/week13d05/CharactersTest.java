package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharactersTest {

    @Test
    public void characterCounterTest(){
        Characters c = new Characters();

        assertEquals(3,c.characterCounter("alma"));
        assertEquals(2,c.characterCounter("Anna   !!!"));
        assertEquals(3,c.characterCounter("alma-alma"));

    }
}
