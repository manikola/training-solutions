package week05d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {


        UserValidator uv = new UserValidator();
        User user1 = new User("Ozzie", 45);
        User user2 = new User("Aniko", 44);
        User user3 = new User("Anna", 44);
        User user4 = new User("Atilla", 8);
        User user5 = new User(" ", 66);
        User user6 = new User("TooOld", 121);
        User user7 = new User("Negative", -40);


        List<User> allValid = List.of(user1, user2, user3);
        List<User> underAge = List.of(user1, user2, user7);
        List<User> overAge = List.of(user1, user2, user6);
        List<User> noName = List.of(user1, user2, user5);

    @Test
    public void testUserValidator1() {
//
        assertEquals(true,uv.validate(allValid));
    }
    @Test
    public void testUserValidatorUnderAge() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            uv.validate(underAge);
        });
        assertEquals("Invalid age", ex.getMessage());
    }

    @Test
    public void testUserValidatorOverAge() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            uv.validate(overAge);
        });
        assertEquals("Invalid age", ex.getMessage());
    }

    @Test
    public void testUserValidatoremptyName() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            uv.validate(noName);
        });
        assertEquals("Name can not be empty", ex.getMessage());
    }


}
