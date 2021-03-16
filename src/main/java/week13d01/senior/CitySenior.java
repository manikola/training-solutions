package week13d01.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public class CitySenior {

    private TreeMap<String,String> postCodes = new TreeMap<>();


    public Map.Entry<String,String>  readFromFile(BufferedReader br){
        try  {
            String line;
            br.readLine();
            while((line = br.readLine()) != null){
                String[] arr = line.split(";");
                postCodes.put(arr[1],arr[0]);

            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }

        return postCodes.firstEntry();


    }




    public static void main(String[] args) {
        try(BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/iranyitoszamok-varosok-2021.csv"))){
            CitySenior c = new CitySenior();
            System.out.println(c.readFromFile(br));

        }catch (IOException e) {
            throw new IllegalStateException("Can not find file",e);
        }
    }
}
//A GitHubon a examples\week13d01\src\main\resources\iranyitoszamok-varosok-2021.csv fájl tartalmazza a magyar városok
// listáját. Add vissza az ábécésorrendben első város nevét és irányítószámát!