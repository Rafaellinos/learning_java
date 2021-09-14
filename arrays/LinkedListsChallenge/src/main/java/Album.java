import java.util.Arrays;
import java.util.LinkedList;

public class Album {

    private String name;

    private LinkedList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new LinkedList<>();
    }

    public LinkedList<Song> addSongs(Song... songs) {
        this.songs.addAll(Arrays.asList(songs));
        return this.songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public void setSongs(LinkedList<Song> songs) {
        this.songs = songs;
    }
}
