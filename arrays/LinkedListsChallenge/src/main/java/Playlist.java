import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private String name;
    private LinkedList<Album> albums;

    public Playlist(String name) {
        this.name = name;
        this.albums = new LinkedList<>();
    }

    public LinkedList<Song> getAllSongs() {
        LinkedList<Song> allSongs = new LinkedList<>();
        ListIterator<Album> albumListIterator = this.albums.listIterator();
        while (albumListIterator.hasNext()) {
            allSongs.addAll(albumListIterator.next().getSongs());
        }
        return allSongs;
    }

    public void playAlgums() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        LinkedList<Song> allSongs = this.getAllSongs();
        if (allSongs.isEmpty()) {
            System.out.println("No Songs in the currently playlist");
            return;
        }
        ListIterator<Song> songListIterator = allSongs.listIterator();
        if (!songListIterator.hasNext() && !songListIterator.hasPrevious()) {
            System.out.println("There is no songs to play");
        }
        Song currentlySong = songListIterator.next();
        while (!quit) {
            this.printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    if (songListIterator.hasNext()) {
                        Song tmpSong = songListIterator.next();
                        if (tmpSong.getTitle().equals(currentlySong.getTitle())) {
                            tmpSong = songListIterator.next();
                        }
                        currentlySong = tmpSong;
                        System.out.println(">> now playing " + currentlySong.getTitle());
                    } else {
                        System.out.println("End of the list");
                    }
                    break;
                case 2:
                    if (songListIterator.hasPrevious()) {
                        Song tmpSong = songListIterator.previous();
                        if (tmpSong.getTitle().equals(currentlySong.getTitle())) {
                            tmpSong = songListIterator.previous();
                        }
                        currentlySong = tmpSong;
                        System.out.println("now playing " + currentlySong.getTitle());
                    } else {
                        System.out.println("<< There is no previous song");
                    }
                    break;
                case 3:
                    if (currentlySong != null) {
                        System.out.println("|| replaying " + currentlySong.getTitle());
                    } else {
                        System.out.println("There is no currently song");
                    }
                    break;
                case 4:
                    this.listAlbums();
                    break;
                case 5:
                    this.listSongs();
                    break;
                case 6:
                    System.out.println("Thanks for using AppMusic!");
                    quit = true;
                    break;
            }
        }
    }

    public LinkedList<Album> addAlbum(Album... albums) {
        this.albums.addAll(Arrays.asList(albums));
        return this.albums;
    }

    public void printMenu() {
        System.out.println("Playlist menu: \n" +
                "1: Forward to the next song\n" +
                "2: Skip backwards to a previous song\n" +
                "3: Replay the current song\n" +
                "4: List albums\n" +
                "5: List Songs\n" +
                "6: Quit\n" +
                "Enter one option: ");
    }

    public void listSongs() {
        System.out.println("Listing songs: ");
        ListIterator<Album> albumListIterator = this.albums.listIterator();
        while (albumListIterator.hasNext()) {
            System.out.println("******");
            Album currentlyAlbum = albumListIterator.next();
            System.out.println("Album: " + currentlyAlbum.getName());
            ListIterator<Song> songListIterator = currentlyAlbum.getSongs().listIterator();
            while (songListIterator.hasNext()) {
                Song song = songListIterator.next();
                System.out.println("    Song: " + song.getTitle() + " Duration: " + song.getDuration());
            }
            System.out.println("******");
        }
    }

    public void listAlbums() {
        System.out.println("Listing albums: ");
        ListIterator<Album> listIterator = this.albums.listIterator();
        int position = 1;
        while (listIterator.hasNext()) {
            System.out.println("" + position + ": " + listIterator.next().getName());
            position ++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(LinkedList<Album> albums) {
        this.albums = albums;
    }
}
