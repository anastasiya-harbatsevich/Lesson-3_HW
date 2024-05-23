package org.example.homework10.Album;

import java.util.ArrayList;

public class Album {

    String title;

    SongList list;

    public Album(String title) {
        this.title = title;
        this.list = new SongList(new ArrayList<Song>());
    }

    class SongList {

        ArrayList<Song> songs;

        public SongList(ArrayList<Song> songs) {
            this.songs = songs;
        }

        public boolean addSong(Song song) {
            if(findSongByTitle(song.title) == null || findSongByTrackNumber(song.trackNumber) == null) {
                this.songs.add(song);
                System.out.println("Song is added " + song.trackNumber + ". ");
                return true;
            }
            System.out.println("Song exists");
            return false;
        }

        public Song findSongByTitle(String title) {
            for (int i = 0; i < songs.size(); i++) {
                if (title.equals(songs.get(i).title)) {
                    System.out.println(songs.get(i).trackNumber + ". " + songs.get(i).artist + " - " + songs.get(i).title);
                    return songs.get(i);
                }
            }
            System.out.println("Title doesn't exist");
            return null;
        }

        public Song findSongByTrackNumber(Integer trackNumber) {
            for (int i = 0; i < songs.size(); i++) {
                if (trackNumber.equals(songs.get(i).trackNumber)) {
                    System.out.println(songs.get(i).title);
                    return songs.get(i);
                }
            }
            System.out.println("Tracking Number isn't found");
            return null;
        }
    }
}
