package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Favorite band: ");
        song.band = scanner.nextLine();
        System.out.println("Favorite title: ");
        song.title = scanner.nextLine();
        System.out.println("Lenght of song: ");
        song.length = scanner.nextInt();

        System.out.println(song.band + "," + "-" + song.title + " (" + song.length +"perc)");
    }
}
