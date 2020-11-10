package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        Operators operators = new Operators();
        System.out.println(operators.isEven(5));
        System.out.println(operators.isEven(10));

        System.out.println(16 >> 1);
        System.out.println(16 << 1);
        System.out.println(13 >> 1);
        System.out.println(13 << 1);

        System.out.println(operators.multiplyByPowerOfTwo(3, 5));
    }
}
