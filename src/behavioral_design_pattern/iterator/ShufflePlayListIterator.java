package behavioral_design_pattern.iterator;

import java.util.ArrayList;
import java.util.Collections;

public class ShufflePlayListIterator implements PlayListIterator{
    private PlayList playList;
    private int index;
    private ArrayList<String> shuffledSongs;

    public ShufflePlayListIterator(PlayList playList) {
        this.playList = playList;
        this.shuffledSongs = new ArrayList<>(playList.getSongs());
        Collections.shuffle(this.shuffledSongs);
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < playList.getSongs().size();
    }

    @Override
    public String next() {
        return shuffledSongs.get(index++);
    }
}
