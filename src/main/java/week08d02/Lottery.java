package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Lottery {

    public List<Integer> getNumbers() {
        List<Integer> fiveDrawResults = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            boolean b = false;
            while (!b) {

                int number = new Random().nextInt(91);
                if (!fiveDrawResults.contains(number) || number == 0) {
                    fiveDrawResults.add(number);
                    b = true;
                }
            }
            }
            return fiveDrawResults;

        }


    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.getNumbers());
    }
}
