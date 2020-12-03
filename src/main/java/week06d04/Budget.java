package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items;

    public Budget(List<Item> items) {
        this.items = new ArrayList<>(items);
    }

    public List<Item> getItemsByMonth(int month) {
        if (month <1 || month  > 12) {
            throw new IllegalArgumentException("Month not valid!");
        }
        List<Item> expenses = new ArrayList<>();
        for ( Item product : items ) {
            if (product.getMonth() == month) {
                expenses.add(product);
            }
        }
        return expenses;
    }
}
