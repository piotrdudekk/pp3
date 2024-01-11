import java.util.ArrayList;

public class CD {
    private int time;
    private String name;
    private ArrayList<Song> songs = new ArrayList<>();

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void deleteSong(Song song) {
        songs.remove(song);
    }

    public String displaySongs() {
        String sg = "";
        for (Song s : songs) {
            sg = sg + "\n" + s.getTitle() + " " + s.getArtist() + " " + s.getTime() + ": \n" + s.displayVerses();
        }
        return sg;
    }

    @Override
    public String toString() {
        return "CD [name=" + getName() + "time=" + getTime() + ", \n songs=" + displaySongs() + "]";
    }

}
