package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinateSystemTest {

    @Test
    public void searchMaxTest(){
        CoordinateSystem cs = new CoordinateSystem();
        Map<Integer,Integer> coordinates = new HashMap<>();
        coordinates.put(25,12);
        coordinates.put(26,48);
        coordinates.put(58,24);

        Map.Entry<Integer,Integer> result = cs.searchMax(coordinates);

        assertEquals(26, result.getKey());
        assertEquals(48, result.getValue());

    }
}
