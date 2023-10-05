import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Library {
    ArrayList<Book> Books = new ArrayList<>();
    void addBook(Book book){
        Books.add(book);
    }
    void removeBook(Book book){
        Books.remove(book);
    }
    public Book findBooksByTitle(String title){
        for(Book book : Books){
            if(book.getTitle().equals(title)){
                System.out.println(book.toString());
                return book;
            }
        }
        return null;
    }
    public ArrayList<Book> findBooksByAuthor(String author){
        ArrayList<Book> byAuthor = new ArrayList<>();
        for(Book book : Books) {
            if (book.getAuthor().equals(author)) {
                byAuthor.add(book);
                System.out.println(book.toString());
            }
        }
        return byAuthor;
    }
    public void sortBooksByYear(){
        Collections.sort(Books, Comparator.comparingInt(Book::getYear));
    }
    public void sortBooksByAuthor() {
        Collections.sort(Books, Comparator.comparing(Book::getAuthor));
    }
    public void sortBooksByRating() {
        Collections.sort(Books, Comparator.comparingInt(Book::getRating));
    }
}
