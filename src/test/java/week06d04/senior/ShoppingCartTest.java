package week06d04.senior;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    @Test
    public void tesztShoppingCartAdd() {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("Kenyér", 1);
        sc.addItem("Kenyér", 1);
        sc.addItem("Tej", 1);
        assertEquals(2, sc.getItems().size());
    }

    @Test
    public void tesztShoppingCartGetQ() {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("Kenyér", 1);
        sc.addItem("Kenyér", 1);
        sc.addItem("Tej", 1);
        assertEquals(2, sc.getItem("Kenyér"));
    }

    @Test
    public void tesztShoppingCartGetNotFound() {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("Kenyér", 1);
        sc.addItem("Kenyér", 1);
        sc.addItem("Tej", 1);
        assertEquals(0, sc.getItem("Hagyma"));
    }

    @Test
    public void tesztShoppingCartGetName() {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("Kenyér", 1);
        sc.addItem("Tej", 1);
        assertEquals("Kenyér", sc.getItems().get(0).getName());
        assertEquals("Tej", sc.getItems().get(1).getName());
    }

}