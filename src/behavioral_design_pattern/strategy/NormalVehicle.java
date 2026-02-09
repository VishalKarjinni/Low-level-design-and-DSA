package behavioral_design_pattern.strategy;

import behavioral_design_pattern.strategy.drive_strategy.DriveStrategy;
import behavioral_design_pattern.strategy.drive_strategy.NormalDrive;

public class NormalVehicle extends Vehicle{

    public NormalVehicle() {
        super(new NormalDrive());
    }
}
