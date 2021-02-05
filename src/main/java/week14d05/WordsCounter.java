package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsCounter {

    public Map<String,Integer> countWords(Path path, String...words){
        List<String> rows = listCreator(path);
        Map<String,Integer> results= new HashMap<>();
        for(String item :words){
            int number =0;
            for(String i :rows){
                if(i.contains(item)){
                    number++;
                }
            }
            results.put(item,number);
        }return results;

       }

    public List<String> listCreator(Path path){
        path = Path.of("src/main/resources/hachiko.srt");
        List<String> rows= new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/hachiko.srt"),Charset.forName("windows-1250"))) {
            String line;
            while((line = reader.readLine()) != null){
                rows.add(line);

            }return rows;

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }

    }

    public static void main(String[] args) {
        WordsCounter wc = new WordsCounter();
        Path path = Path.of("src/main/resources/hachiko.srt");
        System.out.println(wc.countWords(path, "Hachiko", "haza", "pályaudvar", "jó"));
    }
}
