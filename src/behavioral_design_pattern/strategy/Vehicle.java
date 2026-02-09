package behavioral_design_pattern.strategy;

import behavioral_design_pattern.strategy.drive_strategy.DriveStrategy;

public class Vehicle{
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        this.driveStrategy.drive();
    }
}
