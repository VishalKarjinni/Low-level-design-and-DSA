package behavioral_design_pattern.strategy2;

import behavioral_design_pattern.strategy2.fucStrategy.Flyable;
import behavioral_design_pattern.strategy2.fucStrategy.Talkable;
import behavioral_design_pattern.strategy2.fucStrategy.Walkable;

public class WorkerRobot extends Robot{

    public WorkerRobot(Flyable fy, Walkable wl, Talkable tl) {
        super(fy, wl, tl);
    }

    @Override
    public void projection() {
        System.out.println("Displaying Worker Efficiency Status...");
    }
}
