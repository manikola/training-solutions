package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class School {
    List<String> subjects = new ArrayList<>();

    public List<String> readFile(Path path) {

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {

                subjects.add(line);
            }

            return subjects;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file");
        }
    }

    public int calculateHours(String name) {
        int sum = 0;
        for(int i=0; i<subjects.size(); i++) {
            if(subjects.get(i).equals(name)) {
                sum= sum + Integer.parseInt(subjects.get(i+3));
            }
        }return sum;
    }

    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/beosztas.txt");
        School school = new School();
        school.readFile(path);

        System.out.println(school.calculateHours("Albatrosz Aladin"));
    }
}
