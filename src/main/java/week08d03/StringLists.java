package week08d03;

import java.util.ArrayList;
import java.util.List;


public class StringLists {

    public static List<String> stringListsUnion(List<String> first, List<String> second) {
        boolean b = false;
        while (!b) {
            for (String item : first) {
                if (!second.contains(item)) {
                    second.add(item);
                }

                b = true;
            }
        }

        return second;

    }

    public static void main(String[] args) {
        List<String> first = new ArrayList<>();
        first.add("alma");
        first.add("narancs");
        first.add("banán");
        first.add("citrom");
        first.add("mandarin");
        List<String> second = new ArrayList<>();
        first.add("alma");
        first.add("körte");
        first.add("szilva");
        first.add("citrom");
        first.add("narancs");


        System.out.println(StringLists.stringListsUnion(first, second));
    }
}
