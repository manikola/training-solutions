package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        List<String> filteredList = new ArrayList<>();
        String s = String.valueOf(c);
        for(String item: words) {
            if (item.contains(s)) {
                // vagy: if (item.indexOf(c) >= 0) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

//    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
//        list1.add("alma");
//        list1.add("ananász");
//        list1.add("banán");
//        list1.add("dió");
//        list1.add("mogyoró");
//        list1.add("narancs");
//
//        System.out.println(list1);
//        System.out.println(WordFilter.wordsWithChar(list1, 'a'));
//    }

}
