package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1st hour of time: ");
        int hours1 = scanner.nextInt();
        System.out.println("1st minute of time: ");
        int minutes1 = scanner.nextInt();
        System.out.println("1.st second of time: ");
        int seconds1 = scanner.nextInt();

        System.out.println("2nd hour of time: ");
        int hours2 = scanner.nextInt();
        System.out.println("2nd minute of time: ");
        int minutes2 = scanner.nextInt();
        System.out.println("2nd second of time: ");
        int seconds2 = scanner.nextInt();

        Time time1 = new Time(hours1, minutes1, seconds1);
        Time time2 = new Time(hours2, minutes2, seconds2);


        System.out.println("First time: " + time1.toString() + " = " + time1.getInMinutes() + " minute");
        System.out.println("Second time: " + time2.toString() + " = " + time2.getInSeconds() + " seconds");
        System.out.println("1st time is earlier than 2nd: " + time1.earlierThan(time2));
    }
}
