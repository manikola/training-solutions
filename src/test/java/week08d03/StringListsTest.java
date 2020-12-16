package week08d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringListsTest {

    @Test
    public void testStringListsUnion() {

        List<String> first = Arrays.asList("alma","narancs","banán", "citrom", "mandarin");
        List<String> second = Arrays.asList("alma","körte","szilva", "citrom", "narancs");

        assertEquals(Arrays.asList("alma","narancs", "banán", "citrom", "mandarin", "körte", "szilva"), StringLists.stringListsUnion(first,second));





    }


}

