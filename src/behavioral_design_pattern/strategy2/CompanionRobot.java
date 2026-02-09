package behavioral_design_pattern.strategy2;

import behavioral_design_pattern.strategy2.fucStrategy.Flyable;
import behavioral_design_pattern.strategy2.fucStrategy.Talkable;
import behavioral_design_pattern.strategy2.fucStrategy.Walkable;

public class CompanionRobot extends Robot{

    public CompanionRobot(Flyable fl, Walkable wl, Talkable tl) {
        super(fl, wl, tl);
    }

    @Override
    public void projection() {
        System.out.println("Display Friendly Companion feature... ");
    }
}
