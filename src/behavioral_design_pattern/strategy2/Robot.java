package behavioral_design_pattern.strategy2;

import behavioral_design_pattern.strategy2.fucStrategy.Flyable;
import behavioral_design_pattern.strategy2.fucStrategy.Talkable;
import behavioral_design_pattern.strategy2.fucStrategy.Walkable;

import java.awt.datatransfer.FlavorTable;

abstract class Robot {
    protected Flyable flyable;
    protected Walkable walkable;
    protected Talkable talkable;

    public Robot(Flyable fy, Walkable wl, Talkable tl) {
        flyable = fy;
        walkable = wl;
        talkable = tl;
    }

    public void talk() {
        talkable.talk();
    }

    public void walk() {
        walkable.walk();
    }

    public void fly() {
        flyable.fly();
    }

    public abstract void projection();
}
