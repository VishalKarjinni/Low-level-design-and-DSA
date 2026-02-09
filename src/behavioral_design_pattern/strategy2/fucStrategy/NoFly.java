package behavioral_design_pattern.strategy2.fucStrategy;

public class NoFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("No Fly with Robot");
    }
}
