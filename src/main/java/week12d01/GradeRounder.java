package week12d01;

import java.io.BufferedReader;
import java.util.Arrays;

public class GradeRounder {

    public int[] roundGrades(int[] grades) {
        for(int i = 0; i <grades.length; i++) {
            if (grades[i] > 40) {
                int lowLim = grades[i] / 5;
                int upLim = (lowLim + 1) * 5;
                if (upLim - grades[i] < 3) {
                    grades[i] = upLim;
                }
            }
        }
        return grades;
    }
    public static void main(String[] args) {
        GradeRounder g = new GradeRounder();
        System.out.println(Arrays.toString(new int[]{15,39,40,41,49,50,51,52,53,54}));
        System.out.println(Arrays.toString(g.roundGrades(new int[]{15,39,40,41,49,50,51,52,53,54})));
    }
}
//    Készíts egy GradeRounder osztályt, amiben van egy int[] grades roundGrades(int[] grades) metódus.
//        A grades tömb pontszámokat tartalmaz 0 és 100 között.
//        A feladat az, hogy kerekítsük a benne lévő számokat a következő szabály szerint:
//
//        Ha a pontszám és az 5 következő többszöröse közötti különbség kisebb, mint 3, akkor kerekítsük fel a számot az 5 következő többszörösére.
//        Fontos: a 40 pont alatti pontszámok elégtelenek, ezeket egyáltalán nem kell kerekíteni.
//
//
//
//        Példa: a pontszám 84. 85 - 84 kevesebb mint 3, így felfelé kerekítünk.





