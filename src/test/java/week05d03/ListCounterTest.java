package week05d03;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListCounterTest {

    @Test
    public void testcountAletters() {
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList("alma", "banán", "Ancsa","ananász", "körte");


        assertEquals(3,listCounter.countAletters(testList));

    }
    @Test
    public void testStartsWithAEmptyList() {
        ListCounter listCounter = new ListCounter();
        List<String> testlist = new ArrayList<>();

        assertEquals(0,listCounter.countAletters(testlist));
    }

    @Test
    public void testStartsWithNonAList() {
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList("lma", "banán", "ncsa","nanász", "körte");

        assertEquals(0,listCounter.countAletters(testList));
    }
}


