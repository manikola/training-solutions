package week15d01;

import java.util.HashMap;
import java.util.Map;

public class CoordinateSystem {

    private Map<Integer,Integer> coordinates = new HashMap<>();

    public Map.Entry<Integer, Integer> searchMax(Map<Integer,Integer> coordinates) {
        Map.Entry<Integer, Integer> result = null;
        int max = 0;
        for( Integer item : coordinates.values()){
            if( max < item) {
                max = item;
            }
            for(Map.Entry<Integer, Integer> entry : coordinates.entrySet()){
                if(entry.getValue().equals(max)){
                    result = entry;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        CoordinateSystem cs = new CoordinateSystem();
       Map<Integer,Integer> coordinates = new HashMap<>();
        coordinates.put(25,12);
        coordinates.put(26,48);
        coordinates.put(58,24);

        System.out.println(cs.searchMax(coordinates));
    }
}
