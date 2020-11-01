package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Name: " + name);

        System.out.println("Enter your e-mail address:");
        Scanner scannerEmail = new Scanner(System.in);
        String Email = scanner.nextLine();
        System.out.println("e-mail: " + Email);

    }
}