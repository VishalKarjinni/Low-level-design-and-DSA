package behavioral_design_pattern.strategy2.fucStrategy;

public class NormalWalk implements Walkable{
    @Override
    public void walk() {
        System.out.println("Normal Walk with Robot");
    }
}
