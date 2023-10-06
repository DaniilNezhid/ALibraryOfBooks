
public class Book {

    private String title;
    private String author;
    private int year;
    private int ISBN;
    private int rating;
    private String review;

    public Book (String title, String author, int year, int ISBN){
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", ISBN=" + ISBN +
                ", rating=" + rating +
                ", review='" + review + '\'' +
                '}';
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else System.out.println("Please select rating from 1 to 5");
    }

    public int getRating() {
        return rating;
    }
    public void setReview(String review) {
        this.review = review;
    }
    public String getReview() {
        return review;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getISBN(){
        return ISBN;
    }
    public int getYear() {
        return year;
    }

}
