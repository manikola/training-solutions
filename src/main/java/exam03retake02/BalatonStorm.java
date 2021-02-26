package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.Collator;
import java.util.*;

public class BalatonStorm {
    Map<String, Integer> storms = new TreeMap<>();

    public List<String> getStationsInStorm(BufferedReader br) {
        List<String> results = new ArrayList<>();
        String station = null;

        try {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("allomas")) {
                    String[] stationLine = line.split(": ");
                    String name = stationLine[1];
                    station = name.substring(1, name.length() - 2);
                }
                if (line.contains("level\": 3")) {
                    results.add(station);
                }

            }results.sort(Collator.getInstance(new Locale("hu", "HU")));

        } catch (IOException e) {
            e.printStackTrace();
        }


        return results;
    }
}
