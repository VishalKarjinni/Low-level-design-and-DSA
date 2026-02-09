package behavioral_design_pattern.strategy2.fucStrategy;

public class NormalFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("Normal fly with robot");
    }
}
