package behavioral_design_pattern.iterator;

public class FavoritesPlaylistIterator implements PlayListIterator{

    private PlayList playList;
    private int index;

    public FavoritesPlaylistIterator(PlayList playList) {
        this.playList = playList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while (index < playList.getSongs().size()) {
            if (playList.getSongs().get(index).contains("Fav")) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public String next() {
        return playList.getSongs().get(index++);
    }
}
