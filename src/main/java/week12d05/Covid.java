package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Covid {


    public int wordCounter(String word, Path path) {

        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            int counter = 0;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    counter++;
                }
            }
            return counter;

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }

    }


    public static void main(String[] args) {
        Path file = Path.of("src/main/resources/index.html");
        Covid covid = new Covid();
        System.out.println(covid.wordCounter("koronavírus", file));
        System.out.println(covid.wordCounter("biden", file));
        System.out.println(covid.wordCounter("trump",file));
    }

}

