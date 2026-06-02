package behavioral_design_pattern.iterator;

public class SimplePlayListIterator implements PlayListIterator{
    private PlayList playList;
    private int index;

    public SimplePlayListIterator(PlayList playList) {
        this.playList = playList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < playList.getSongs().size();
    }

    @Override
    public String next() {
        return playList.getSongs().get(index++);
    }
}
