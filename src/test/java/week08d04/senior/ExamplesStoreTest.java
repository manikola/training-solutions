package week08d04.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamplesStoreTest {

    @Test
    public void getTitlesOfExamplesTest(){
        ExamplesStore es = new ExamplesStore();

        assertEquals(2, es.getTitlesOfExamples().size());
        assertEquals("Első feladat",es.getTitlesOfExamples().get(0));
        assertEquals("Második feladat",es.getTitlesOfExamples().get(1));
    }
}
