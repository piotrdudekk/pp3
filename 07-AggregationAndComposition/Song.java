import java.util.ArrayList;

public class Song {
    private String title;
    private double time;
    private Artist artist;
    private ArrayList<Verse> verses;

    public Song(String title, double time, Artist artist) {
        this.title = title;
        this.time = time;
        this.artist = artist;
        this.verses = new ArrayList<Verse>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public ArrayList<Verse> getVerses() {
        return verses;
    }

    public void setVerses(ArrayList<Verse> verses) {
        this.verses = verses;
    }

    public void addVerse(Verse verse) {
        verses.add(verse);
    }

    public void deleteVerse(Verse verse) {
        verses.remove(verse);
    }

    public String displayVerses() {
        String s = "";
        for (Verse v : verses) {
            s = s + "\n" + v.getLine() + " " + v.getSentence();
        }
        return s;
    }

    @Override
    public String toString() {
        return "Song [title=" + getTitle() + ", time=" + getTime() + ", artist=" + getArtist()
                + ", verses=" + displayVerses() + "]";
    }

}
