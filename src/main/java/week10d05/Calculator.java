package week10d05;

import java.util.Arrays;

public class Calculator {

    public static int findMinSum(int[] arr) {
        if (arr.length < 4) {
            throw new IllegalArgumentException("At least 4 numbers!");
        }
        Arrays.sort(arr);
        int sum =0;
        for (int i=0; i <= 3 ; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
