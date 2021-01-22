package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Covid {




        public int wordCounter(String word) {
            Path file = Path.of("src/main/resources/index.html");
            try (BufferedReader br = new BufferedReader(Files.newBufferedReader(file))) {
                int counter = 0;
                String line;
                while( (line = br.readLine()) != null) {
                    if( line.toLowerCase().contains(word)) {
                        counter++;
                    }
                }return counter;
            } catch (IOException e) {
                throw new IllegalStateException("Can not read file",e);
            }
        }

    public static void main(String[] args) {
            Covid covid = new Covid();
        System.out.println(covid.wordCounter("koronavírus"));
        System.out.println(covid.wordCounter("biden"));
        System.out.println(covid.wordCounter("trump"));
    }

    }

