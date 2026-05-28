package behavioral_design_pattern.statePattern;

public class GreenState implements TrafficStateLight{
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("Switching from GREEN to YELLOW. Slow down!");
        trafficLightContext.setState(new YellowState());
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
