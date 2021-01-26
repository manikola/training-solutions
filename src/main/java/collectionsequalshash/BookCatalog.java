package collectionsequalshash;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book searchedItem = new Book(title,author);
        if(!books.contains(searchedItem)){
            return null;
        }
        int index = books.indexOf(searchedItem);
        return books.get(index);
    }





    public Book findBook(List<Book> books, Book book) {
        if( !books.contains(book)){
            return null;
        }
        int index= books.indexOf(book);
        return books.get(index);
    }



    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> localBooks = new HashSet<>();
        for(Book item : books) {
            localBooks.add(item);
        }
        return localBooks;
    }
}
