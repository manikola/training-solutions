package ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countryList = new ArrayList<>();

    public List<Country> getCountryList() {
        return new ArrayList(countryList);
    }

    public void readFromFile(String name) {
       try( BufferedReader reader = new BufferedReader(new InputStreamReader
                (CountryStatistics.class.getResourceAsStream("/" + name)))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] arr = line.split(" ");
                Country item = new Country(arr[0], Integer.parseInt(arr[1]));
                countryList.add(item);
            }
        } catch (IOException e) {
           throw new IllegalStateException("Can not read file",e);
       }
    }
    public Country mostBorderCountries() {
        Country max = countryList.get(0);
        for (Country item : countryList) {
            if( item.getBorderCountries() > max.getBorderCountries()) {
                max = item;
            }
        }
        return max;
    }

    public int numberOFCountries(){
        return countryList.size();
    }


}
