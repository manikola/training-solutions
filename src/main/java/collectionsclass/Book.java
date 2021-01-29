package collectionsclass;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private int id;
    private String author;
    private String title;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.valueOf(this.id).compareTo(Integer.valueOf(o.getId())) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book) || o == null) return false;
        Book book = (Book) o;
        return getId() == book.getId();
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return id + " " + author + " " + title;
    }
}
