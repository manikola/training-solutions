package week06d02;

import java.util.ArrayList;
import java.util.List;

import static week06d02.Categories.*;

public class Store {

    private List<Product> products;

    public Store(List<Product> products) {

        this.products = products;
    }

    public String getProductByCategoryName(Categories category) {
        int count = 0;
        for ( Product item : products ) {
            if (item.getCategory().equals(category)) {
                count++;
            }
        }
        return count + "items of requested category";
    }

    public static void main(String[] args) {
       Store store = new Store();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("bread", BAKEDGOODS, 250));
        productList.add(new Product("apple", OTHER, 250));
        productList.add(new Product("banana", OTHER, 800));
        productList.add(new Product("milk", DAIRY, 230));
        productList.add(new Product("kifli", BAKEDGOODS, 50));




        System.out.println(store.getProductByCategoryName(OTHER));


    }

}
