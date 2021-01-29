package week05d05.senior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SongTest {

    @Test
    public void songNameIsEmpty() throws IllegalArgumentException {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Song("", 329, "Metallica");
        });
        Assertions.assertEquals("Name cannot be empty", ex.getMessage());
    }

    @Test
    public void songArtistIsEmpty() throws IllegalArgumentException {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Song("Enter Sandman", 329, null);
        });
        Assertions.assertEquals("Artist cannot be empty", ex.getMessage());
    }

    @Test
    public void songLengthIsBad() throws IllegalArgumentException {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Song("Enter Sandman", -5, "Metallica");
        });
        Assertions.assertEquals("Song must be longer, than zero", ex.getMessage());
    }
}