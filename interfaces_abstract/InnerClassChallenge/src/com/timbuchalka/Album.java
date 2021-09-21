package com.timbuchalka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.addSong(new Song(title, duration));
    }

    private Song findSong(String title) {
        return this.songs.findSong(title);
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        Song checkSong = this.songs.findSong(trackNumber);
        if (checkSong != null) {
            playList.add(checkSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkSong = this.songs.findSong(title);
        if (checkSong != null) {
            playList.add(checkSong);
            return true;
        }
        System.out.println("This album does not have a title " + title);
        return false;
    }

    private class SongList implements Iterable<Song> {

        private List<Song> songs;

        @Override
        public Iterator<Song> iterator() {
            // by implementing the iterable class, we are able to
            // loop through the songs by using the song list class
            // ex: for(Song checkedSong: this.songs)
            return this.songs.iterator();
        }

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public SongList(List<Song> songs) {
            this.songs = songs;
        }

        public boolean addSong(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        public Integer size() {
            return this.songs.size();
        }

        public Song get(Integer index) {
            if (this.songs.size() <= 0 ) {
                System.out.println("There is no songs to get");
            } else {
                return this.songs.get(index);
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            if (trackNumber >= 0 && trackNumber < this.songs.size()) {
                return this.songs.get(trackNumber);
            }
            return null;
        }

        public Song findSong(String songTitle) {
            List<Song> songsFound = this.songs.stream().filter(song -> song.getTitle().equalsIgnoreCase(songTitle)).collect(Collectors.toList());
            if (songsFound.size() > 0) {
                return songsFound.get(0);
            }
//            for (int i=0; i<this.songs.size(); i++) {
//                if (this.songs.get(i).getTitle().equalsIgnoreCase(songTitle)) {
//                    System.out.println("Song found in index: " + i);
//                    return this.songs.get(i);
//                }
//            }
            return null;
        }
    }
}
