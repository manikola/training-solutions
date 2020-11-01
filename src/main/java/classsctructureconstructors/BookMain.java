package classsctructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Zola", "Germinal");

        book.register("111");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Registration Nr: " + book.getRegNumber());
    }
}
