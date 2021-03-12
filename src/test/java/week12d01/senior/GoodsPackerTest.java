package week12d01.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsPackerTest {

    @Test
    void packGoods() {
        GoodsPacker gp = new GoodsPacker();
        int[][] types = {{7, 160}, {3, 90}, {2, 15}};
        assertEquals(555, gp.packGoods(types, 20));
    }
}