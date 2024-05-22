package org.example.homework10.Album;

public class Main {
    public static void main(String[] args) {
        Album album = new Album("Haribo");
        album.list.addSong(new Song("Adel", "Hello", 6, 3.7));
        album.list.addSong(new Song("SoAD", "Toxicity", 8, 4.0));
        album.list.addSong(new Song("Rammstein", "Mutter", 5, 3.9));
        album.list.addSong(new Song("Test", "Mutter", 5, 3.9));
        album.list.addSong(new Song("Rammstein", "Sonne", 4, 3.3));
        System.out.println("Title of an Album: " + album.title);
    }
}
