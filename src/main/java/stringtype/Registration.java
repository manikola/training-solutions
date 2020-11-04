package stringtype;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        System.out.println("Enter password one more time:");
        String password2 = scanner.nextLine();

        System.out.println("E-mail address:");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValidUsername(username) ? "username accepted" : "incorrect username");
        System.out.println(userValidator.isValidPassword(password, password2) ? "password accepted" : "incorrect password");
        System.out.println(userValidator.isValidEmail(email) ? "e-mail accepted" : "incorrect e-mail");
    }
}
