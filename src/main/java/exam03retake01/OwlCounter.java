package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OwlCounter {


    private Map<String, Integer> birds = new HashMap<>();


    public  void readFromFile(BufferedReader br){
        try  {
            String line;
            while((line = br.readLine()) != null){
                String[] arr = line.split("=");
                String key = arr[0];
                int value = Integer.parseInt( arr[1]);
                birds.put(key,value);

            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }
    }

    public int getNumberOfOwls(String county){
        return birds.get(county);
    }

}
