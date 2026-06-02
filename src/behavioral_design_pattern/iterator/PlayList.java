package behavioral_design_pattern.iterator;

import java.util.ArrayList;

public class PlayList {
    ArrayList<String> songs;

    public PlayList() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public PlayListIterator iterator(String type) {
        return switch (type) {
            case "simple" -> new SimplePlayListIterator(this);
            case "shuffled" -> new ShufflePlayListIterator(this);
            case "favorites" -> new FavoritesPlaylistIterator(this);
            default -> null;
        };
    }

    public ArrayList<String> getSongs() {
        return songs;
    }
}
