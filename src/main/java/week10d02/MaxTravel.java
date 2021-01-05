package week10d02;

import java.util.Arrays;
import java.util.List;

public class MaxTravel {

    public static int getMaxIndex(List<Integer> boarding){
        int counters[] = new int[30];
        for(int i : boarding) {
            counters[i]++;
        }
        System.out.println(Arrays.toString(counters));

        int index = 0;
        for(int i = 0; i < counters.length; i++) {
            if(counters[index] < counters[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int max = new MaxTravel().getMaxIndex(List.of(12,12,0,3,3,3,3,3,4,4,12));
        System.out.println(max);
    }
}
