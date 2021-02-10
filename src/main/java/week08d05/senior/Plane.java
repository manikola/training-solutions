package week08d05.senior;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Plane {

    public int longestOcean(Path path) {
        int max = 0;
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(path))) {
            int maxLength = 0;
            int counter = 0;
            byte[] b = new byte[1];

            while (inputStream.available() > 0) {
                inputStream.read(b);
                if (b[0] == 48) {
                    maxLength = Math.max(maxLength, ++counter);
                } else {
                    counter = 0;
                }
            }
            return maxLength;

        } catch (NullPointerException | IOException e) {
            throw new IllegalStateException("Can't read from file!", e);
        }
    }


    public static void main(String[] args) {
        Plane plane = new Plane();
        Path path = Path.of("src/main/resources/map.txt");

        System.out.println(plane.longestOcean(path));
    }
}
