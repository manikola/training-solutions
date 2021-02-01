package week14d01;

import java.lang.reflect.Array;
import java.util.*;

public class Indexer {


    public Map<Character, List<String>> index(List<String> names) {
        Map<Character, List<String>> results = new TreeMap<>();

        for (int i=0; i< names.size();i++) {
            char key = names.get(i).charAt(0);
            if(results.containsKey(key)){
                List<String> temp = results.get(key);
                        temp.add(names.get(i));
               results.put(key, temp);
            }
            else{
                List<String> temp2 = new ArrayList<>();
                temp2.add(names.get(i));
                results.put(key, temp2);
            }

                }
                 return results;

           }


    public static void main(String[] args) {

        System.out.println(new Indexer().index(Arrays.asList("Béla","Odon", "Lujza","Lajos","Luka","Levi","Lola", "Abraham", "Magdolna")));

    }
}
