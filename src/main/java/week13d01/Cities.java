package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cities {

    public String longestCity(BufferedReader reader) {
        String longestCityName = "";
        int max = 0;
                try  {
            String line;
            reader.readLine(); //skipping header
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(";");
                String city = arr[1];
                if (city.length() > longestCityName.length()) {

                    longestCityName = city;
                }

            }
        }catch(IOException e){
                throw new IllegalStateException("Can not read file", e);
            }
            return longestCityName;
        }



    public static void main(String[] args) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of("src/main/resources/iranyitoszamok-varosok-2021.csv"))){
            String city = new Cities().longestCity(bufferedReader);
            System.out.println(city);

        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
