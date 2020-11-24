package algorithmsmax;

import java.util.List;

public class IntegerMaxCalculator {

    public int max(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (Integer item : numbers) {
            if (item > max) {
                max = item;
            }
        }
        return max;

    }
}