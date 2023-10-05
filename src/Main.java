import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book Oracle = new Book("Java", "Oracle", 2001, 1234);
        Book Book1 = new Book ("Book1", "author1", 2002,4213);
        Book Book2 = new Book ("Book2", "author2", 2003, 4187);
        library.addBook(Oracle);
        library.addBook(Book1);
        library.addBook(Book2);
        library.findBooksByAuthor("Oracle");
        library.findBooksByTitle("Book1");
        Oracle.setRating(5);
        Oracle.setReview("Cool book");
        System.out.println(Oracle.getRating());
        System.out.println(Oracle.getReview());
    }
}