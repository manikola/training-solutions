package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please add first number: ");
int firstnumber = scanner.nextInt();
        System.out.println("First number: " + firstnumber);

        System.out.println("Please add second number: ");
        int secondnumber = scanner.nextInt();
        System.out.println("Second number: " + secondnumber);

        System.out.println(firstnumber +" + " + secondnumber);
        System.out.println(firstnumber+secondnumber);
    }
}
