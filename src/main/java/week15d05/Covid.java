package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Covid {

    public List<Data> readFromFile(BufferedReader br){
        List<Data> filteredInfo = new ArrayList<>();
        try  {
            String line;
           br.readLine();
            while((line = br.readLine()) != null){

                createListFromFile(line);

            }
            return filteredInfo;

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }
    }

    public List<Data> createListFromFile(String line){
        List<Data> filteredInfo = new ArrayList<>();
        String[] arr = line.split((","));
        int weeklyCases = Integer.parseInt(arr[2]);
        String country = arr[4];
        int population = Integer.parseInt(arr[7]);
        filteredInfo.add(new Data(country,weeklyCases,population));
        return filteredInfo;
    }

    public Map<String,Integer> summedCases(List<Data> filteredInfo){
        Map<String,Integer> summedCasesPerCountry = new HashMap<>();
         for(Data item : filteredInfo){
             if (summedCasesPerCountry.containsKey(item.getCountry())) {
                 int sum = 0;
                 for (Data i : filteredInfo) {
                     sum += i.getWeeklyCases();
                     int avg = sum / i.getPopulation();
                     summedCasesPerCountry.put(item.getCountry(), avg);
                 }
             }else {
                 int sum = 0;
                     for(Data i : filteredInfo){
                         sum += i.getWeeklyCases();
                         int avg = sum/ i.getPopulation();
                     summedCasesPerCountry.put(item.getCountry(), avg);
                 }

             }
         }return summedCasesPerCountry;

    }









    public static void main(String[] args) {
        try(BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/corona.csv"))){
            Covid c = new Covid();
            List<Data> covidList = c.readFromFile(br);
            c.summedCases(covidList);

        }catch (IOException e) {
            throw new IllegalStateException("Can not find file",e);
        }
    }


}
