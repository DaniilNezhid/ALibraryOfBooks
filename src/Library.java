import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    void addBook(Book book){
        books.add(book);
    }
    void removeBook(Book book){
        books.remove(book);
    }

    public ArrayList<Book>  findBooksByTitle(String title){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : books){
            if(!title.isEmpty()  && book.getTitle().equals(title)){
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> findBooksByAuthor(String author){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : books) {
            if (!author.isEmpty() && book.getAuthor().equals(author)) {
                result.add(book);
                System.out.println(" The book: " + book.toString() + "has been added to the collection with author " + author);
            }
        }
        return result;
    }

    public void sortBooksByYear(){
        books.sort(Comparator.comparingInt(Book::getYear));
    }
    public void sortBooksByAuthor() {
        books.sort(Comparator.comparing(Book::getAuthor));
    }
    public void sortBooksByRating() {
        books.sort(Comparator.comparingInt(Book::getRating));
    }
}
