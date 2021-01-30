package week06d02.senior;

public class Product {

    private String name;
    private Category category;
    private int price;

    public Product(String name, Category category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}


//Hozz létre egy Product osztályt melynek adattagjai a név, kategória és ár. A kategória legyen enum FROZEN, DAIRY,
// BAKEDGOODS, OTHER felsorolókkal. Készíts egy Store osztályt benne egy Product listával, amit konstruktorban kap meg.
// Legyen egy getProductsByCategory() aminek az lényége, hogy visszaadja valamilyen adatszerkezetben, hogy melyik
// kategóriából hány darab van a listában. A "valamilyen adatszerkezet" a kreativításodra van bízva, az a lényeg,
// hogy valahogy egyben kapjam meg, hogy melyik kategóriából hány darab van.