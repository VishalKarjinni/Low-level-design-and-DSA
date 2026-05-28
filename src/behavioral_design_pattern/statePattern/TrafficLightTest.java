package behavioral_design_pattern.statePattern;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLightContext trafficLightContext = new TrafficLightContext();
        trafficLightContext.next(); // RED --> Green
        trafficLightContext.next(); // Green --> Yellow
        trafficLightContext.next(); // Yellow --> Red
        trafficLightContext.next(); // RED --> Green
    }
}
