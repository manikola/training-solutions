package week14d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class IndexerTest {

    @Test
    void index() {
        List<String> startList = new ArrayList<>(Arrays.asList("Abraham","Lujza", "Magdolna","Odon",
                "Aladar", "Lajos", "Otto", "Lorant" ));
        Indexer indexer = new Indexer();
        Map<Character,List<String>> testMap= new HashMap<>();
        testMap.put('A',Arrays.asList("Abraham", "Aladar"));
        testMap.put('M',Arrays.asList("Magdolna"));
        testMap.put('L',Arrays.asList("Lujza", "Lajos","Lorant"));
        testMap.put('O',Arrays.asList("Odon", "Otto"));
        Map<Character,List<String>> returnMap = indexer.index(startList);
        Assertions.assertEquals(testMap,returnMap);
        //System.out.println(returnMap);

    }
}
