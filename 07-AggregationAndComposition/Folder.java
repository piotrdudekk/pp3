import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<File>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void deleteFile(String fileName) {
        boolean deleted = false;
        for (File file : files) {
            if (file.getName() == fileName) {
                files.remove(file);
                deleted = true;
            }
        }
        if (deleted == true) {
            System.out.println("File " + fileName + " deleted.");
        } else {
            System.out.println("File " + fileName + " not found.");
        }

    }

    public void displayContents() {
        System.out.println("Folder Contents:");
        for (File file : files) {
            System.out.println(file.getName() + " - Size: " + file.getSize());
        }
        System.out.println("End of Folder Contents \n");
    }

    public static void main(String[] args) {
        Folder folder1 = new Folder("Nowy Folder");
        File f1 = new File("Picture", 24);
        File f2 = new File("Film", 256);
        File f3 = new File("Mp3", 98);

        folder1.addFile(f1);
        folder1.addFile(f2);
        folder1.displayContents();
        folder1.addFile(f3);
        folder1.displayContents();
        folder1.deleteFile("Film");
        folder1.displayContents();
    }

}
