package week09d03;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test

    public void testOverFourteen() {
        Person p = new Person("Jack",16);

        p.setPresent();

        assertNotEquals(null, p.getPresent());
        assertNotEquals(Present.TOY, p.getPresent());
    }
}
