package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFilterTest {

    @Test
    public void testWordsWithChar() {
        WordFilter wordFilter = new WordFilter();
        List<String> list1 = new ArrayList<>();
        list1.add("alma");
        list1.add("ananász");
        list1.add("banán");
        list1.add("dió");
        list1.add("mogyoró");
        list1.add("narancs");



      assertEquals(Arrays.asList("alma", "ananász", "banán", "narancs"),wordFilter.wordsWithChar(list1, 'a'));
      assertEquals(Arrays.asList("banán"),WordFilter.wordsWithChar(list1, 'b'));
      assertEquals(Arrays.asList("dió", "mogyoró"),WordFilter.wordsWithChar(list1, 'ó'));


    }

}
