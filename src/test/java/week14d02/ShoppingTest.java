package week14d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingTest {

    Shopping sh = new Shopping();
    Path file = Path.of("src/main/resources/deliverylist.txt");

    @BeforeEach
    public void setUp() {
        sh.readFile(Path.of("src/main/resources/deliverylist.txt"));
    }


    @Test
    void getItemsAlphabeticalTest() {
        sh.readFile(Path.of("src/main/resources/deliverylist.txt"));
        Set<String> result = sh.getItemsAlphabetical("B341");
        assertEquals("[basil, cheese, passata, pasta]", result.toString());
    }

    @Test
    public void getItemByNameTest() {
        assertEquals(1, sh.getItemByName("basil"));

    }

    @Test
    public void itemsOnListTest(){
        assertEquals(4, sh.itemsOnList("B341"));
    }

    @Test
    public void statisticsTest() {
        Map<String, Integer> results = sh.statistics();
        assertEquals(2,results.get("rosmary").intValue());

    }

}
