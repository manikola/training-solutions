package week02d04;

import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        for (int i=0; i < 5; i++) {
            System.out.println("Enter name: ");
            names[i] = scanner.nextLine();
        }
        int i = 1;
        for(String item : names) {
            System.out.println(i + ". name: " + item);
            i++;
        }
    }
}
