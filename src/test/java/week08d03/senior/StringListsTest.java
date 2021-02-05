package week08d03.senior;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void testMethod() {
        List<String> words = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        List<String> shortest = Arrays.asList("aa", "bb", "dd");

        assertEquals(shortest, new StringLists().shortestWords(words));
    }
}
