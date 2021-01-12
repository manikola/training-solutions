package week11d01;

import java.util.ArrayList;
import java.util.List;

public class DivisorFinder {

    public static int findDivisors(int n) {

        int count = 0;
        int digit = n;

        while (digit != 0) {

            if( (digit % 10 !=0) && (n % (digit %10) == 0)) {
                count++;
            }
            digit = digit / 10;
        }
        return count;
    }



    public static void main(String[] args) {

        System.out.println(DivisorFinder.findDivisors(-15));
        DivisorFinder divisorFinder = new DivisorFinder();

    }
}
