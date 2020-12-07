package week07d01;

public class MathAlgorithms {

    public static boolean isPrime(int x) {
        if ( x < 0) {
            throw new IllegalArgumentException("Number has to be positive!");
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
            return true;
        }


    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

}
