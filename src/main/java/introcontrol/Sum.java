package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.println("Enter five numbers");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + ". number:");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
