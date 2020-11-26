package week05d04;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void testGetNumberOfExpired() {
        Store store = new Store();
        List<Product> productList = new ArrayList<>();
        store.addProduct(new Product("kenyér", 2020, 11, 22));
        store.addProduct(new Product("alma", 2020, 11, 27));
        store.addProduct(new Product("banán", 2020, 11, 22));

        assertEquals(2, store.getNumberOfExpired());
    }

    @Test
    public void testZeroNumberOfExpired() {
        Store store = new Store();
        List<Product> productList = new ArrayList<>();
        store.addProduct(new Product("kenyér", 2021, 11, 22));
        store.addProduct(new Product("alma", 2021, 11, 27));
        store.addProduct(new Product("banán", 2021, 11, 22));

        assertEquals(0, store.getNumberOfExpired());
    }


}
