package week12d03.senior;

public class AgeSorter {

    public int[] sortAges(int[] ages) {
        int[] result = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int max = findMax(ages);
            int maxIndex = findMaxIndex(ages, max);
            result[i] = max;
            ages[maxIndex] = 0;
        }
        return result;
    }

    private int findMax(int[] ages) {
        int max = Integer.MIN_VALUE;
        for (int item : ages) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    private int findMaxIndex(int[] ages, int max) {
        int maxIndex = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] == max) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

}
//Készítsünk egy osztályt AgeSorter néven, melynek van egy int[] sortAges(int[] ages) metódusa. Az ages tömbben emberek
// életkorai szerepelnek. A feladat az, hogy visszaadjunk egy tömböt, mely az életkorokat tartalmazza sorrendbe rendezve.
// Ne használjunk beépített sorrendbe rendező algoritmusokat (Collections.sort) a feladat megoldásához!
