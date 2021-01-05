package week10d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {

    @Test
    public void testGetPlusElevation() {

        List<Double> points = new ArrayList();
        points.add(10d);
        points.add(20d);
        points.add(15d);
        points.add(18d);

        assertEquals(13.0,Hiking.getPlusElevation(points));



    }
}
