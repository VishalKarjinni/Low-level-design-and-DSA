package behavioral_design_pattern.strategy2.fucStrategy;

public class NormalTalk implements Talkable{
    @Override
    public void talk() {
        System.out.println("Robot with normal talk");
    }
}
