package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Shopping {

    private Map<String,Set<String>> productList= new HashMap<>();

    public void readFile(Path path) {
        path = Path.of("src/main/resources/deliverylist.txt");
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/deliverylist.txt"))) {
            String line;
            while((line = reader.readLine()) != null){
                String[] arr = line.split(" ");
                String code = arr[0];
                String[] items =arr[1].split(",");
                for(String i : items){
                    Set<String> products = new TreeSet<>(Arrays.asList(items));
                    productList.put(code,products);

                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }
    }

    public Set<String> getItemsAlphabetical(String code) {
       return productList.get(code);
    }

    public int getItemByName(String name){
        int counter= 0;
        for(Set item : productList.values()){
           if(item.contains(name)){
               counter++;
           }
        }return counter;
    }

    public int itemsOnList(String code) {
        return productList.get(code).size();
    }

    public Map<String,Integer> statistics() {
        Map<String, Integer> results = new TreeMap<>();
        for (Set<String> item : productList.values()) {
            for (String i : item) {
                if (results.containsKey(i)) {
                    int value = results.get(i);
                    results.put(i, value + 1);
                } else {
                    results.put(i, 1);
                }

            }

        }return results;
    }

    public static void main(String[] args) {
        Shopping sh = new Shopping();
        sh.readFile(Path.of("src/main/resources/deliverylist.txt"));

        System.out.println(sh.getItemsAlphabetical("B341"));
        System.out.println(sh.getItemByName("basil"));
        System.out.println(sh.itemsOnList("B341"));
        System.out.println(sh.statistics());

    }



}
