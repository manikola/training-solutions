package week10d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {

    @Test
    public void testGetPlusElevation() {

        List<Double> points = new ArrayList();
        points.add(10.0);
        points.add(20.0);
        points.add(15.0);
        points.add(18.0);

        assertEquals(13.0,Hiking.getPlusElevation(points));



    }
}
