package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String barcode) {
        Item removable = null;
        for (Item subject : items) {
            if( subject.getBarcode().equals(barcode)) {
                removable = subject;
            }
        }
        items.remove(removable);
    }

    public void clearBasket() {
        items.clear();
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }



}
