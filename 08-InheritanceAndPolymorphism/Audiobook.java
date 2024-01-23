public class Audiobook extends Book {
    private int minutes;
    private int seconds;

    public Audiobook(String title, Writer author, int year, int minutes, int seconds) {
        super(title, author, year);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String displayBook() {
        return "Audiobook [title=" + getTitle() + ", author=" + getAuthor().displayWriter() + ", duration="
                + getMinutes()
                + ":" + getSeconds() + ", publisher=" + getPublisher().displayPublisher() + ", year" + getYear() + "]";
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Żulczyk", "realizm");
        Audiobook a1 = new Audiobook("Ślepnąc", w1, 2016, 121, 14);
        Audiobook a2 = new Audiobook("Dawno", w1, 2024, 183, 23);
        Book b3 = new Book("Informacja", w1, 2021);

        System.out.println(a1.displayBook());
        System.out.println(a2.displayBook());
        System.out.println(b3.displayBook());
    }

}
