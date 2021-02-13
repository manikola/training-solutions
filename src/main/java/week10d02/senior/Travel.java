package week10d02.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Travel {

    public static int getStopWithMax(InputStream is) {
        int stop = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            int[] stops = new int[30];
            int max= 0;
            String line;
            while ((line = br.readLine()) != null) {
                String stopString = line.substring(0, line.indexOf(" "));
                int stopNumber = Integer.parseInt(stopString);
                stops[stopNumber] += 1;
            }
            for (int i = 0; i < stops.length; i++) {
                if (stops[i] > max) {
                    max = stops[i];
                    stop = i;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
        return stop;
    }


    public static void main(String[] args) {

        InputStream is = Travel.class.getResourceAsStream("/utasadat.txt");
        System.out.println(Travel.getStopWithMax(is));




}
}

//Adott egy fájl, utasadat.txt, mely a következőket tartalmazza:
//
//0 20190326-0700 6572582 RVS 20210101
//0 20190326-0700 8808290 JGY 7
//0 20190326-0700 1680423 TAB 20190420
//12 20190326-0716 3134404 FEB 20190301
//12 20190326-0716 9529716 JGY 0
//Egy sor egy felszálló adatait tárolja. Egy sorban a megálló száma az első oszlop. Írj egy
// Travel.getStopWithMax(InputStream) metódust, mely visszaadja, hogy melyik megállóban szerettek volna a legtöbben
// felszállni! Maximum 30 megálló lehet.