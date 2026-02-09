package behavioral_design_pattern.strategy.drive_strategy;

public class GoodsDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is GoodsDrive");
    }
}
