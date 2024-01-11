import java.util.ArrayList;

public class Book {
    private String name;
    private int pages;
    private Writer writer;
    private int year;
    private ArrayList<Chapter> chapters;

    public Book(String name, int pages, Writer writer, int year) {
        this.name = name;
        this.pages = pages;
        this.writer = writer;
        this.year = year;
        this.chapters = new ArrayList<Chapter>();
    }

    public int getPages() {
        return pages;
    }

    public Writer getWriter() {
        return writer;
    }

    public int getYear() {
        return year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Chapter> getChapters() {
        return this.chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public void deleteChapter(Chapter chapter) {
        chapters.remove(chapter);
    }

    public String displayChapters() {
        String s = "";
        for (Chapter c : getChapters()) {
            s = s + " " + c.getTitle() + ",";
        }
        return s;
    }

    public String toString() {
        return ("Name: " + getName() + "\nPages: " + getPages() + "\n Year: " + getYear() + "\n Writer: "
                + getWriter().getName() + " " + getWriter().getDateOfBirth() + "\n Chapters: " + displayChapters());
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Jakub Żulczyk", "21.09.2000");
        Chapter c1 = new Chapter("Początek", 36, 4);
        Chapter c2 = new Chapter("Co dalej", 48, 37);
        Book b1 = new Book("Ślepnąc", 800, w1, 2023);

        b1.addChapter(c1);
        b1.addChapter(c2);

        System.out.println(b1.toString());
        // System.out.println(w1.getName() + w1.getDateOfBirth());
    }

}
