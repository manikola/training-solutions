package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int readFile(String name) {
        Path path = Path.of(name);
        try {
            String fileContent = Files.readString(Path.of(name));
            int number = Integer.parseInt(fileContent);
            return number;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public int sumNumbers() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            String filename = "number" + (i < 10 ? "0" + i : i) + ".txt";
            System.out.println(filename);

            if (Files.isRegularFile(Path.of(filename))) {
                int number = readFile(filename);
                sum += number;
            }


        }return sum;
    }






    public static void main(String[] args) {
        FilesSum fileSum = new FilesSum();
        System.out.println(fileSum.sumNumbers());
    }


}
