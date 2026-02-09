package behavioral_design_pattern.strategy2;

import behavioral_design_pattern.strategy2.fucStrategy.NoFly;
import behavioral_design_pattern.strategy2.fucStrategy.NormalTalk;
import behavioral_design_pattern.strategy2.fucStrategy.NormalWalk;

public class StrategyDesignPatternMain {
    public static void main(String[] args) {
        Robot robot = new CompanionRobot(new NoFly(), new NormalWalk(), new NormalTalk());
        robot.fly();
        robot.walk();
        robot.talk();
        robot.projection();
    }
}
