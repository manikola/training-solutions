package week06d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {

    @Test
    public void testGetItemsByMonth() {
        Budget budget = new Budget(Arrays.asList(
        new Item("kenyér", 50, 11),
        new Item("alma", 50, 11),
        new Item("tej", 50, 12),
        new Item("kifli", 50, 12)

        ));

            assertEquals("[50, 50]" ,budget.getItemsByMonth(11));


    }
}
