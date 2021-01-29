package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

    private List<Book> library = new ArrayList<>();

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> getLibrary() {
        return library;
    }

    public List<Book> createUnmodifiableLibrary() {
        return Collections.unmodifiableList(this.library);
    }//módosíthatatlan listát eredményez


    public List<Book> reverseLibrary() {
        List<Book> reversedList =new ArrayList<>(library);
        Collections.sort(reversedList);
        Collections.reverse(reversedList);
        return reversedList;
    }//az eredeti lista másolatán dolgozik!


    public Book getFirstBook() {
        return Collections.min(library);
    }//a legrégebbi (legkisebb id) könyvet adja vissza


    public Book getLastBook() {
        return Collections.max(library);
    }// a legújabb (legnagyobb id) könyvet adja vissza
}
