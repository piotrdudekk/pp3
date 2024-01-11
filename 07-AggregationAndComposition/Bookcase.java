import java.util.ArrayList;

public class Bookcase {
    private int number;
    private ArrayList<Book> books = new ArrayList<Book>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    public void displayBookcase() {
        System.out.println("Bookcase number " + getNumber() + ":");
        int i = 1;
        for (Book b : books) {
            System.out.println(" " + i + ". " + b.getName() + " " + b.getPages() + " " + b.getYear()
                    + " " + b.getWriter().getName() + " " + b.displayChapters());
            i = i + 1;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Bookcase bookcase1 = new Bookcase();
        Writer w2 = new Writer("Jakub Żulczyk", "21.09.2000");
        Book b2 = new Book("Ślepnąc", 900, w2, 2016);
        Book b3 = new Book("Dawno", 800, w2, 2023);
        Book b4 = new Book("Pogrzeb", 700, w2, 2022);
        Chapter c1 = new Chapter("Start", 4, 36);
        Chapter c2 = new Chapter("Co dalej?", 46, 37);

        b2.addChapter(c1);
        b2.addChapter(c2);
        b3.addChapter(c1);

        bookcase1.addBook(b2);
        bookcase1.displayBookcase();
        bookcase1.addBook(b3);
        bookcase1.addBook(b4);
        bookcase1.displayBookcase();
        bookcase1.deleteBook(b4);
        bookcase1.displayBookcase();
    }

}
