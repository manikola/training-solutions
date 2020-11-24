package recursion;

public class FactorialCalculator {


    public long getFactorial(int n) {
        if (n > 1) {
            return n * getFactorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        FactorialCalculator fc = new FactorialCalculator();
        fc.getFactorial(7);
    }
}

