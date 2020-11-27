package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test

    public void testGetFullNameWithoutAt() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("Anikó", "Hegedüs", "manikolayahoo.com"));
        assertEquals("e-mail format not valid!", ex.getMessage());
    }

    @Test

    public void testGetFullNameWithoutDot() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("Anikó", "Hegedüs", "manikola@yahoocom"));
        assertEquals("e-mail format not valid!", ex.getMessage());
    }
    @Test

    public void testGetFullName() {
        User user = new User("Anikó", "Hegedüs", "manikola@yahoo.com");


        assertEquals("Anikó Hegedüs", user.getFullName());
    }

}
