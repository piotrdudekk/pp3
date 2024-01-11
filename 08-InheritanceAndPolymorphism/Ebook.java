package 08-InheritanceAndPolymorphism;

public class Ebook extends Book {
    private String fileName;

    public Ebook (String title, String author, String fileName){
        super (title, author);
        this.fileName = fileName;
    }

    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String displayInfo(){
        return "Ebook [title=" + getTitle() + ", author=" + getAuthor() + "file name=" fileName + "]";
    }

    public static void main(String[] args){
        Ebook e1 = new Ebook("Slepnac", "Żulczyk", "slepnacodswiatel1");
    }

}
