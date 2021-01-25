package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cities {

    public String longestCity() {
        String longestCityName = null;
        int max = 0;
        Path path = Path.of("src/main/resources/iranyitoszamok-varosok-2021.csv");
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] cities = line.split(";");

                String longestCity = null;
                if (cities[1].length() > max) {
                    max = cities[1].length();
                    longestCityName = (cities[1]);
                }

            }
        }catch(IOException e){
                throw new IllegalStateException("Can not read file", e);
            }
            return longestCityName;
        }





    public static void main(String[] args) {
        Cities c = new Cities();
        System.out.println(c.longestCity());
    }
}
