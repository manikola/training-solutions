package week05d04.senior;

public class Product {

    private long price;
    private Currency currency;

    public Product(long price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public long getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double convertPrice(Currency currency) {
        if (currency.getName().equals("HUF")) {
            return (price * 300);
        }else{
            return (price / 300);
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(25100,Currency.USD);
        Product product2 = new Product(50,Currency.USD);

        System.out.println(product1.convertPrice(Currency.HUF));
        System.out.println(product2.convertPrice(Currency.USD));
    }
}
