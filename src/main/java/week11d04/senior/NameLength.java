package week11d04.senior;

import java.util.ArrayList;
import java.util.List;

public class NameLength {

    public List<Integer> getLengths(List<String> names) {
        List<Integer> results = new ArrayList<>();
        for (String item : names) {
            if (item.startsWith("J")) {
                int length = item.length();
                if (!results.contains(length)) {
                    results.add(length);
                }
            }

        }
        return results;
    }
}
//Adott egy nevek listája. Add vissza egy listában, hogy milyen hosszúságú J karakterrel kezdődő nevek szerepelnek a
// listában! Minden szám csak egyszer szerepeljen! A NameLength osztály getLengths(List<String>) metódusába dolgozz!
// Ha a bemenet pl. List.of("Joe", "Jack", "Jane", "Jake", "George", "William"), a visszatérési érték [3, 4] legyen!