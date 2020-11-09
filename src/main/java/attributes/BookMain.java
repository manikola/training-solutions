package attributes;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Légy jó mindhalálig");
        System.out.println(book.getTitle());

        book.setTitle("Pál utcai fiúk");
        System.out.println(book.getTitle());



    }
}
