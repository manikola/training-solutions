package collectionsset.collectionstreeset;

import java.util.Set;
import java.util.TreeSet;

public class WordFilter {

    public Set<String> filterWords(String[] randomStrings){
        Set<String> inOrderList = new TreeSet<String>();
        for(String item : randomStrings){
            inOrderList.add(item);
        }
        return inOrderList;
    }
}
