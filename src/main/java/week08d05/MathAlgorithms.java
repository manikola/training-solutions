package week08d05;

public class MathAlgorithms {

    public static int greatestCommonDivisor(int a, int b) {
        int min = 1;
        for( int i = 1; i < a && i < b; i++) {
            if (a % i == 0 && b % i == 0) {
                min = i;
            }
        }
            return min;
        }

    public static void main(String[] args) {
        System.out.println(MathAlgorithms.greatestCommonDivisor(30, 60));
    }
}
