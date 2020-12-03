package week06d04;

import java.util.List;

public class Budget {

    private List<Item> items;

    public Budget(List<Item> items) {
        this.items = items;
    }

    public int getItemsByMonth(int month) {
        int count = 0;
        for ( Item product : items ) {
            if (product.getMonth() == month) {
                count++;
            }
        }
        return count;
    }
}
