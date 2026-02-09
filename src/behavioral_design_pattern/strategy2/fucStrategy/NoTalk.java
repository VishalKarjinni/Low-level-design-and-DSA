package behavioral_design_pattern.strategy2.fucStrategy;

public class NoTalk implements Talkable{
    @Override
    public void talk() {
        System.out.println("No Talk With Robot");
    }
}
