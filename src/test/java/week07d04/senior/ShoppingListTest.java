package week07d04.senior;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingListTest {

    @Test
    public void calculateSumTest() {
        ShoppingList sl = new ShoppingList();

        assertEquals(750, sl.calculateSum("shopping_list.txt"));
    }
}
