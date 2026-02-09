package behavioral_design_pattern.strategy.drive_strategy;

public class SportyDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This Is SportyDrive");
    }
}
