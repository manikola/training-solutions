package week11d01.senior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.Arrays.*;
import static java.util.Arrays.sort;
import static org.junit.jupiter.api.Assertions.*;

class PairFinderTest {

    @Test
    public void testPairFinder() {
        int[] arr = new int[] {1, 2, 3, 4, 1, 2, 5, 5, 6, 5, 7, 5, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Assertions.assertEquals(4, new PairFinder().findPairs(arr));
    }
}