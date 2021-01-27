package week05d04.senior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    Product p1 = new Product (600, Currency.HUF);
    Product p2 = new Product (6, Currency.USD);

    @Test
    public void testHUF() {
        Assertions.assertEquals(2.0, p1.convertPrice(Currency.USD));
    }

    @Test
    public void testUSD() {
        Assertions.assertEquals(1800.0, p2.convertPrice(Currency.HUF));
    }
}

