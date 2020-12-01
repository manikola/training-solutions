package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    @Test

    public void testGetProductByCategoryName() {
        Store store = new Store(Arrays.asList(
                new Product("bread", Category.BAKEDGOODS, 20),
                new Product("coffee", Category.OTHER, 20),
                new Product("apple", Category.OTHER, 20),
                new Product("frozen berries", Category.FROZEN, 20),
                new Product("milk", Category.DAIRY, 20)
        ));

        assertEquals(2, store.getProductByCategoryName(Category.OTHER));
    }

}
