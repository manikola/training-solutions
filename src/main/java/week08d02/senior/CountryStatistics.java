package week08d02.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<String> countryList = new ArrayList<>();

    public List<String> getCountryList() {
        return new ArrayList<>(countryList);
    }

    Path path = Path.of("countries.txt");

    public List<String> readFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                countryList.add(line);

            }
            return countryList;

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file");
        }

    }


    public String maxPopulation() {
        String maxC = null;
        int max = 0;
        for(String item : countryList){
            String[] arr = item.split(" ");
            int pop = Integer.parseInt(arr[1]);
            if( pop > max) {
                max = pop;
                maxC = item;
            }
        }
        return maxC;

    }
}

//Adott a countries.txt állomány, melyet helyezz el a projekt gyökérkönyvtárába. A fájlban az adatok a következők:
// ország_neve népesség hány_színű_a_zászló szomszédos_országok_száma. Készíts a week08d02 csomagba egy
// CountryStatistics osztályt melyben van egy metódus, ami az adatokat beolvassa egy listába. A lista legyen az
// osztály privát attribútuma, és legyen hozzá getter metódus, figyelj arra, hogy ezen keresztül ne lehessen
// megváltoztatni a listát. Készíts egy metódust maxPopulaton() néven, ami a listából visszaadja a legnagyobb
// népességű ország minden adatát. Adatok:
// Nepal 31 3 2


