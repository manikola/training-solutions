package week06d04.senior;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public ShoppingCart(List<Item> items) {
        this.items = new ArrayList(items);
    }

    public ShoppingCart() {

    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void addItem(String name, int quantity) {
        boolean isOnTheList = false;
        for (Item i : items) {
            if (i.getName().equals(name)) {
                int q= i.getQuantity();
                q += quantity;
                i.setQuantity(q);

                isOnTheList = true;
            }
        }
        if (isOnTheList == false) {
            Item item = new Item(name, quantity);
            items.add(item);
        }
    }

    public int getItem(String name) {
        int count = 0;
        for(Item i : items){
            if( i.getName().equals(name)){
                count= i.getQuantity();
            }

        }return count;

    }

}


//A ShoppingCart osztályba dolgozz! Legyen egy addItem(String name, int quantity) metódusa, mellyel új bevásárlólista
// tételt lehet felvenni (termék neve és mennyisége). Az adatokat egy Item listába tárolja. Amennyiben már benne van
// az adott termék, ne újonnan vegye fel, hanem adja hozzá a mennyiséget a már felvett tételhez! Lehessen
// visszakérdezni név alapján a felvett mennyiséget a getItem(String name): int metódussal. Ha nem szerepel benne,
// 0 értéket adjon vissza!