package week02;

import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {

        System.out.println("Enter five names");
        Scanner scanner = new Scanner(System.in);
        String name = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + ". new name:");
            String newname = scanner.nextLine();

        }
        System.out.println("Names: " ); // nem tanulatam a tömböket
    }
}
