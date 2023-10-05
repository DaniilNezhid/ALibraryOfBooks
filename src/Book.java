import org.w3c.dom.ls.LSOutput;

public class Book {
    private String title = "";
    private String author = "";
    private int year = 0;
    private int ISBN = 0;
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

    public Book (String title, String author, int year, int ISBN){
        this.title=title;
        this.author=author;
        this.year = year;
        this.ISBN=ISBN;
    }
    @Override
    public String toString(){
        return title +" "+ author +" "+ year +" "+ ISBN;
    }
    private int rating;
    private String review;
    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else System.out.println("1, 2, 3, 4, 5");
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
}
