package week11d01.senior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairFinder {

    List<Integer> numbers = new ArrayList<>();

    public int findPairs(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Invalid array;");
        }
        Arrays.sort(arr);
        sumNumbers(arr);
        int sum = 0;
        for (Integer item : numbers) {
            sum += (item / 2);
        }
        return sum;
    }

    private void sumNumbers(int[] arr) {
        int sum = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                sum++;
            } else if (arr[i + 1] != arr[i]) {
                numbers.add(sum);
                sum = 1;
            }
        }
    }
}
//Készítsünk egy PairFinder nevű osztályt, melynek van egy int findPairs(int[] arr) metódusa. A feladat az, hogy a
// tömb elemeiből kikeressük, hogy hány darab pár van bennük. Ha egy szám kétszer szerepel a tömbben, akkor az egy
// párnak számít. Példa: A [5, 1, 4, 5] tömbben kétszer szerepel az 5, ezért a visszatérési érték 1.
// A [7, 1, 5, 7, 3, 3, 5, 7, 6, 7] tömbben négyszer szerepel a 7, ezért ez 2 párnak számít, illetve a 3 kétszer
// szerepel, így a visszatérési érték 3.