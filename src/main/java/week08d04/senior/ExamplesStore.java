package week08d04.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExamplesStore {

    public List<String> getTitlesOfExamples(){
        List<String> titles = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                ExamplesStore.class.getResourceAsStream("/examples.md")))) {
            String line;
            while((line = reader.readLine()) != null) {
                if( line.startsWith("#")){
                    String title = line.substring(2);
                    titles.add(title);
                }
            }return titles;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

    public static void main(String[] args) {
        ExamplesStore es = new ExamplesStore();
        System.out.println(es.getTitlesOfExamples());
    }
}
