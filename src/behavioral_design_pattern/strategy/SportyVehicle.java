package behavioral_design_pattern.strategy;

import behavioral_design_pattern.strategy.drive_strategy.SportyDrive;

public class SportyVehicle extends Vehicle{

    public SportyVehicle() {
        super(new SportyDrive());
    }

}
