package week07d03.senior;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTest {

    @Test
    public void createDateTest(){
        Date date = new Date(1976,12,27);
        assertEquals(LocalDate.of(1976, 12, 27).toString(), date.toString());
    }
    @Test
    public void ofTest(){
        Date date = new Date(1976,12,27);
        assertEquals(date.toString(),Date.of(1976, 12, 27).toString());
    }
    @Test
    public void withYearTest(){
        Date date = new Date(1976,12,27);
        assertEquals(LocalDate.of(1977, 12, 27).toString(), date.withYear(1977).toString());
    }
}
