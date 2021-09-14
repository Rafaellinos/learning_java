import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Song smellsLikeTeenSpirit = new Song("Smells Like Teen Spirit", 5.01);
        Song inBloom = new Song("In Bloom", 4.11);
        Song comeAsYouAre = new Song("Come as You Are", 3.38);
        Song breed = new Song("Breed", 3.03);
        Song lithium = new Song("Lithium", 4.16);
        Song polly = new Song("Polly", 2.57);
        Song territorialPissings = new Song("Territorial Pissings", 2.22);
        Song drainYou = new Song("Drain You", 3.43);


        Album nevermind = new Album("Nevermind");
        nevermind.addSongs(smellsLikeTeenSpirit, inBloom, comeAsYouAre, breed, lithium, polly, territorialPissings, drainYou);

        Playlist playlist = new Playlist("Nirvana");
        playlist.addAlbum(nevermind);

        playlist.playAlgums();

    }
}
