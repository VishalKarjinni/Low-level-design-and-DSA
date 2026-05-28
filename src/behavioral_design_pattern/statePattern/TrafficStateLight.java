package behavioral_design_pattern.statePattern;

public interface TrafficStateLight {
    void next(TrafficLightContext trafficLightContext);
    String getColor();
}