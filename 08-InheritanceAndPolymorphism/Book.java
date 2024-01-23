public class Book {
    private String title;
    private Writer author;
    private Publisher publisher;
    private int year;

    public Book(String title, Writer author, int year) {
        this.title = title;
        this.author = author;
        this.publisher = null;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Writer getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Writer author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayBook() {
        return "Book [title=" + getTitle() + ", author=" + getAuthor().displayWriter() +
                ", publisher=" + getPublisher().displayPublisher() + ", year=" + getYear() + "]";
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Żulczyk", "realizm");
        Book b1 = new Book("Dawno temu w Warszawie", w1, 2014);
        System.out.println(b1.displayBook());
    }

}
