package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 100) {
            System.out.println("nagyobb, mint száz");
        }  else {
            System.out.println("száz, vagy kisebb");
        }

    }
}
