package array;

public class ArrayMain {


    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(days[1]);
        System.out.println(days.length);

        int[] powersOfTwo = new int[6];
        powersOfTwo[0] = 1;

        for (int i = 1; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
        }
        for (int i = 0; i < powersOfTwo.length; i++) {
            System.out.print(powersOfTwo[i] + " ");

        }

        boolean[] tomb = new boolean[6];

        for (int i = 1; i < tomb.length; i++) {
            tomb[i] = !tomb[i - 1];
        }
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }


    }
}

