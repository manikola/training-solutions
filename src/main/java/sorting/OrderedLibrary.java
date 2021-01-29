package sorting;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class OrderedLibrary {

    private Set<Book> library = new TreeSet<>();

    public OrderedLibrary(Set<Book> library) {
        if (library == null) throw new NullPointerException("Library can not be empty!");
        this.library = library;
    }


    public Book lendFirstBook() {
        Iterator<Book> iterator = library.iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        throw new NullPointerException("Library is empty!");
    }
}


