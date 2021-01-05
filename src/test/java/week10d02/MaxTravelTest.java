package week10d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxTravelTest {

    @Test

    void getMaxIndex() {

        assertEquals(3,new MaxTravel().getMaxIndex(List.of(12,12,0,3,3,3,3,3,4,4,12)));
    }
}
