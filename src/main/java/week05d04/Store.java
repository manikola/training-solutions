package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    public List<Product> inventory = new ArrayList<>();

    public void addProduct(Product product) {
        inventory.add(product);

    }
    public List<Product> getProductList() {
        return getProductList();
    }
    public int getNumberOfExpired(List<Product> inventory) {
        int count = 0;
        for (Product item : inventory) {
            if (item.getDateOfExpire().isBefore(LocalDate.now())) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Store store = new Store();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("kenyér", 2020, 11, 22));
        productList.add(new Product("alma", 2020, 11, 27));
        productList.add(new Product("banán", 2020,11,22));
