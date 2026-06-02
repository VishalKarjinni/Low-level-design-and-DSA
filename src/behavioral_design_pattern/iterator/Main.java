package behavioral_design_pattern.iterator;

public class Main {
    public static void main(String[] args) {
        // Create a playlist
        PlayList playlist = new PlayList();
        playlist.addSong("Song 1");
        playlist.addSong("Song 2 Fav");
        playlist.addSong("Song 3");
        playlist.addSong("Song 4 Fav");
        playlist.addSong("Song 5");

        // Simple Playlist Iterator
        System.out.println(" Simple Playlist:");
        PlayListIterator simpleIterator = playlist.iterator("simple");
        while (simpleIterator.hasNext()) {
            System.out.println("Playing: " + simpleIterator.next());
        }

        // Shuffled Playlist Iterator
        System.out.println(" Shuffled Playlist:");
        PlayListIterator shuffledIterator = playlist.iterator("shuffled");
        while (shuffledIterator.hasNext()) {
            System.out.println("Playing: " + shuffledIterator.next());
        }

        // Favorites Playlist Iterator
        System.out.println(" Favorites Playlist:");
        PlayListIterator favoritesIterator = playlist.iterator("favorites");
        while (favoritesIterator.hasNext()) {
            System.out.println("Playing: " + favoritesIterator.next());
        }

    }
}
