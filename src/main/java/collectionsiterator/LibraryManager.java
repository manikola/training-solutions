package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks = new HashSet<>();

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber) {
        Book match;
     Iterator<Book> i = libraryBooks.iterator();

     while(i.hasNext()) {
         match = i.next();
         if(match.getRegNumber() == regNumber) {
             return match;
         }

     }
     throw new MissingBookException("No books found with regnumber: "+ regNumber);
    }

    public int removeBookByRegNumber(int regNumber){
        Book match;
        Iterator<Book> i = libraryBooks.iterator();

        while(i.hasNext()) {
            match = i.next();
            if(match.getRegNumber() == regNumber){
                i.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author){
        Set<Book> authorsAll = new HashSet<>();
        Book match;
        Iterator<Book> i = libraryBooks.iterator();

        while(i.hasNext()) {
            match = i.next();
            if (match.getAuthor().equals(author)){
                authorsAll.add(match);
            }
        }
        if(authorsAll.isEmpty()) {
            throw new MissingBookException("No books found by " + author);
        }
        return authorsAll;
    }

    public int libraryBooksCount(){
        return libraryBooks.size();
    }
}
