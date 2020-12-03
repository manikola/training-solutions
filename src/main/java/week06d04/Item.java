package week06d04;

public class Item {

    private String name;
    private int price;
    private int month;

    public Item(String name, int price, int month) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank!");
        }
        this.name = name;
        if (price  <= 0) {
            throw new IllegalArgumentException("Price must be greater, than zero!");
        }
        this.price = price;
        if (month <1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }
}
