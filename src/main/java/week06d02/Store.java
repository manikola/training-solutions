package week06d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Store {

    private List<Product> products;

    public Store(List<Product> products) {

        this.products = products;
    }


    public int getProductByCategoryName(Category categoryName) {
        int count = 0;
        for ( Product item : products ) {
            if (item.getCategory().equals(categoryName)) {
                count++;
            }
        }
        return count;
    }


}
