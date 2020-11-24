package algorithmsdecision;

import java.util.List;

public class IntegerDecisionMaker {

    public boolean containsGreaterThan(List<Integer> numbers, int min) {
        for (Integer item : numbers) {
            if (item > min){
                return true;
            }
        }
        return false;
    }

    public boolean containsLowerThan(List<Integer> numbers, int max) {
        for (Integer item : numbers) {
            if (item < max) {
                return true;
            }
        }
        return false;
    }
}
