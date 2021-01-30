package week06d02.senior;

import java.util.ArrayList;
import java.util.List;

public class Store {

    //private List<Product> products = new ArrayList<>();


    public String getProductsByCategory(List<Product> products) {

        int other = 0;
        int frozen = 0;
        int dairy = 0;
        int bakedGoods = 0;
        for (Product item : products) {
            if (item.getCategory().equals(Category.OTHER)) {
                other++;
            }
            if (item.getCategory().equals(Category.BAKED_GOODS)) {
                bakedGoods++;
            }
            if (item.getCategory().equals(Category.DAIRY)) {
                dairy++;
            }
            if (item.getCategory().equals(Category.FROZEN)) {
                frozen++;
            }

        }
        return "Other: " + other + "\n" +
                "Baked goods: " + bakedGoods + "\n" +
                "Dairy: " + dairy + "\n" +
                "Frozen: " + frozen;
    }
}
