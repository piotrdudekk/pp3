import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void deleteBook(Book b) {
        books.remove(b);
    }

    public String displayBooks() {
        String s = "";
        for (Book b : books) {
            s = s + "\n " + b.displayBook();
        }
        return "Library: \n" + s;
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Żulczyk", "realizm");
        Library lib1 = new Library();
        Ebook e1 = new Ebook("Slepnac", w1, 2014, "slepnacodswiatel1");
        Ebook e2 = new Ebook("Dawno", w1, 2023, "dawnotemuwwarszawie1");
        Book b2 = new Book("Pogrzeb", w1, 2020);
        Audiobook a1 = new Audiobook("Ślepnąc", w1, 2016, 121, 14);
        Audiobook a2 = new Audiobook("Dawno", w1, 2024, 183, 23);
        Book b3 = new Book("Informacja", w1, 2021);
        Publisher p1 = new Publisher();

        b2.setPublisher(p1);
        b3.setPublisher(p1);
        e1.setPublisher(p1);
        e2.setPublisher(p1);
        a1.setPublisher(p1);
        a2.setPublisher(p1);

        lib1.addBook(b2);
        lib1.addBook(b3);
        lib1.addBook(e1);
        lib1.addBook(e2);
        lib1.addBook(a1);
        lib1.addBook(a2);
        System.out.println(lib1.displayBooks());
        lib1.deleteBook(e2);
        lib1.deleteBook(a1);
        System.out.println("\n" + lib1.displayBooks());
    }
}
