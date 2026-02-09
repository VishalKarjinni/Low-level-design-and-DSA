package behavioral_design_pattern.strategy2.fucStrategy;

public class NoWalk implements Walkable{
    @Override
    public void walk() {
        System.out.println("No Walk With Robot");
    }
}
