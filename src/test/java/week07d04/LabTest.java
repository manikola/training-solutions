package week07d04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LabTest {

    @Test

    void testConstructor() {
        Lab lab = new Lab("Method overload");

        assertEquals("Method overload", lab.getTitle());
        assertEquals(null, lab.getCompletedAt());
        Assertions.assertFalse(lab.isCompleted());
    }
    @Test
     void TestConstructorWithParameter() {
        Lab lab = new Lab("Metódus ", LocalDate.of(2020, 10,12));

        assertEquals(LocalDate.of(2020, 10,12), lab.getCompletedAt());
        assertTrue(lab.isCompleted());
        assertEquals("Metódus ", lab.getTitle());

     }
    @Test
     void testComplete() {
        Lab lab = new Lab("Metódus");
        lab.complete();

        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.now(), lab.getCompletedAt());
     }




}




