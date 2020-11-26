package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {


    public int countAletters(List<String> words) {
        int count = 0;
        for (String item : words) {
            String s = item.substring(0, 1).toLowerCase();
            if (s.equals("a")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ListCounter listCounter = new ListCounter();
        List<String> myList = new ArrayList<>();
        myList.add("alma");
        myList.add("banán");
        myList.add("Aniko");
        myList.add("körte");

        System.out.println("" + listCounter.countAletters(myList));

    }
}




