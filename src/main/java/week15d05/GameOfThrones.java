package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GameOfThrones {
    Map<String, Integer> results = new HashMap<>();

    public Map<String,Integer> readFromFile(BufferedReader br) {
        Map<String,Integer> results = new HashMap<>();
        try {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                String[] houses = new String[]{arr[5], arr[6], arr[7], arr[8], arr[9], arr[10], arr[11], arr[12]};
                for (String item : houses) {
                    if(!item.isBlank()){
                        if (results.containsKey(item)) {
                            int value = results.get(item);
                            results.put(item, value + 1);
                        } else {
                            results.put(item, 1);
                        }
                    }
                }

            }

            return results;

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }

    }

    public String getMostViolentHouse(Map<String,Integer> results) {
        int max = 0;
        String house = null;
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                house = entry.getKey();
            }
        }
        return house;
    }

    public static void main(String[] args) {
        try(BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/battles.csv"))){
            GameOfThrones gt = new GameOfThrones();
            Map<String,Integer> result = gt.readFromFile(br);
            System.out.println(gt.getMostViolentHouse(result));

        }catch (IOException e) {
            throw new IllegalStateException("Can not find file",e);
        }
    }


}
