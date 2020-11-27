package week05d02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChangeLetterTest {

    @Test
    public void testchangeVowels() {
        ChangeLetter changeLetter = new ChangeLetter();

        assertEquals("s*p*rc*l*fr*g*l*st*c*xp**l*d*c***s", changeLetter.changeVowels("Supercalifragilisticexpialidocious"));

    }
}