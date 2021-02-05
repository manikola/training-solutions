package week08d03.senior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        List<String> shortestList = new ArrayList<>();
        int min = words.get(0).length();
        for (String s : words) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        for (String s : words) {
            if (s.length() == min) {
                shortestList.add(s);
            }
        }
        return shortestList;
    }
}



//Készíts a week08d03 csomagban egy StringLists osztályt és benne egy shortestWords(List<String> words) metódust,
// mely paraméterül kap egy String listát és a legrövidebb szavakat vissza adja belőle egy Listában.
// PL :{"aaa", "aa", "bb", "cccc", "dd"} Itt a legrövidebb szavak az "aa", "bb", "dd".
