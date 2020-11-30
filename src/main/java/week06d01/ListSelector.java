package week06d01;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {


    public String textToConvert(List<String> words) {
        StringBuilder converted = new StringBuilder();
        if (words == null) {

            throw new IllegalArgumentException("List cannot be empty!");
        }
        if (words.size() != 0) {
            converted.append("[");
            for (int i = 0; i < words.size(); i += 2) {
                converted.append(words.get(i));
            }
            converted.append("]");
        }
        return converted.toString();



    }

}
