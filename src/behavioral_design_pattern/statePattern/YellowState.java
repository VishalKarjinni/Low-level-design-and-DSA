package behavioral_design_pattern.statePattern;

public class YellowState implements TrafficStateLight{
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("Switching from YELLOW to RED. Stop!");
        trafficLightContext.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}
