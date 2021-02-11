package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Corona {

    public List<String> readFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/corona.csv"))) {
            String line;
            List<Data> casesPerWeek = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(",");
                String week = arr[1];
                int cases = Integer.parseInt(arr[2]);

                if (line.contains("Hungary")) {
                    casesPerWeek.add(new Data(week,cases));
                }

            }
            Collections.sort(casesPerWeek);
            List<String> weeks = new ArrayList<>();
            for (int i = casesPerWeek.size()-1; i >casesPerWeek.size() -4; i--){
                weeks.add(casesPerWeek.get(i).getWeek());
            }
            return weeks;

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public static void main(String[] args) {
        Corona c = new Corona();
        Path path = Path.of("src/main/resources/corona.csv");
        System.out.println(c.readFile(path));
    }



}

