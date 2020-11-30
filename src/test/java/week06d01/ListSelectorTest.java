package week06d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListSelectorTest {

    ListSelector listSelector = new ListSelector();

    @Test

    public void testTextToConvert() {
        assertEquals("[almakörte]", listSelector.textToConvert(Arrays.asList("alma", "banán", "körte", "szilva")));

    }
    @Test
    public void testTextToConvertNullList() {
        assertEquals("", listSelector.textToConvert(Arrays.asList()));

    }
}

