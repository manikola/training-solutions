package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the diameter of first circle?");
        int diameter1 = scanner.nextInt();

        Circle circle1 = new Circle(diameter1);
        System.out.println(circle1.perimeter());
        System.out.println(circle1.area());

        System.out.println("What's the diameter of second circle?");
        int diameter2 = scanner.nextInt();

        Circle circle2 = new Circle(diameter2);
        System.out.println(circle2.perimeter());
        System.out.println(circle2.area());
    }
}
