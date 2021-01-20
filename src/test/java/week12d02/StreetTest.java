package week12d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week12d02.FenceType.PERFECT;

public class StreetTest {

    @Test
    void getHouseNumberTest() {
        Street street = new Street();
        street.sellSite(new Site(true, 10, FenceType.PERFECT));
        street.sellSite(new Site(true, 7, FenceType.NEED_UPGRADE));
        street.sellSite(new Site(false, 12, FenceType.NEED_UPGRADE));
        street.sellSite(new Site(true, 9, FenceType.PERFECT));
        street.sellSite(new Site(true, 11, FenceType.NO_FENCE));
        street.sellSite(new Site(false, 13, FenceType.PERFECT));


        assertEquals(3, street.getHouseNumber());
    }
    @Test
    void makeStatisticsTest() {
        Street street = new Street();
        street.sellSite(new Site(true, 1, FenceType.PERFECT));
        street.sellSite(new Site(true, 2, FenceType.NEED_UPGRADE));
        street.sellSite(new Site(false, 3, FenceType.NEED_UPGRADE));
        street.sellSite(new Site(true, 4, FenceType.PERFECT));
        street.sellSite(new Site(true, 5, FenceType.NO_FENCE));
        street.sellSite(new Site(false, 6, FenceType.PERFECT));

        assertEquals(3, street.makeStatistics().size());
        assertEquals(3, street.getStatistics().get(0).getCount());
        assertEquals(2, street.getStatistics().get(1).getCount());
    }



}
