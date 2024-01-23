public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, Writer author, int year, String fileName) {
        super(title, author, year);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String displayBook() {
        return "Ebook [title=" + getTitle() + ", author=" + getAuthor().displayWriter() + "file name="
                + getFileName() + ", publisher=" + getPublisher().displayPublisher() + ", year= " + getYear() + "]";
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Żulczyk", "realizm");
        Ebook e1 = new Ebook("Slepnac", w1, 2016, "slepnacodswiatel1");
        Ebook e2 = new Ebook("Dawno", w1, 2023, "dawnotemuwwarszawie1");
        Book b2 = new Book("Pogrzeb", w1, 2020);

        System.out.println(e1.displayBook());
        System.out.println(e2.displayBook());
        System.out.println(b2.displayBook());
    }

}
