package week06d02.senior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void getProductsByCategoryTest() {
        Store s = new Store();
        List<Product> pr = List.of(
                new Product("alma",Category.OTHER, 125),
                new Product("tej",Category.DAIRY, 200),
                new Product("eper",Category.FROZEN, 500),
                new Product("kifli",Category.BAKED_GOODS, 50)
        );
        assertEquals("Other: 1\nBaked goods: 1\nDairy: 1\nFrozen: 1", s.getProductsByCategory(pr));

    }
}
