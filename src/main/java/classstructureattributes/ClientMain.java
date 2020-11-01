package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Enter your name: ");
        client.name = scanner.nextLine();
        System.out.println("Year of birth: ");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Location: ");
        client.address = scanner.nextLine();

        System.out.println("Name: " + client.name);
        System.out.println("Year: " + client.year);
        System.out.println("Location: " + client.address);

    }
}


