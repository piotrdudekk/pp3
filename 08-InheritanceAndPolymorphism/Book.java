public class Book {
    private String title;
    private String author;

    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String displayBook() {
        return "Book [title=" + title + ", author=" + author + "]";
    }

    public static void main(String[] args){
        Book b1 = new Book("Dawno temu w Warszawie", "Żulczyk");
        System.out.println(b1.displayBook());
    }

    
}
