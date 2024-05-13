package org.example.homework10.Album;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Album album = new Album();
        Album.SongList songList = album.new SongList(new ArrayList<Song>());
        songList.songs.add(new Song("Adel", "Hello", 6, 3.7));
        songList.songs.add(new Song("SoAD", "Toxicity", 8, 4.0));
//        songList.findSongByTitle("Hello");
//        songList.findSongByTitle("Test");
//        songList.findSongByTrackNumber(7);
//        songList.findSongByTrackNumber(6);
        songList.addSong(new Song("Rammstein", "Mutter", 5, 3.9));
        songList.addSong(new Song("Test", "Mutter", 5, 3.9));
        songList.addSong(new Song("Rammstein", "Sonne", 4, 3.3));
        System.out.println(songList.songs);
    }
}
