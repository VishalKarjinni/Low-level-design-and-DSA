package behavioral_design_pattern.statePattern;

public class RedState implements TrafficStateLight {
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("Switching from RED to GREEN. Cars go!");
        trafficLightContext.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
