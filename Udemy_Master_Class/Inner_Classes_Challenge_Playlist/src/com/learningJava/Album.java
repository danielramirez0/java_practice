package com.learningJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList tracks;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.tracks = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.tracks.add(new Song(title, duration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.tracks.getTrackSize())) {
            playList.add(this.tracks.findSong(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song songSearch = tracks.findSong(title);
        if (songSearch != null) {
            playList.add(songSearch);
            return true;
        }
        System.out.println("Song not found with title " + title);
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        private Song findSong(String title) {
            for (Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
        }

        public int getTrackSize() {
            return songs.size();
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index > 0 && index < songs.size()) {
                return songs.get(index);
            } else {
                return null;
            }
        }
    }

}