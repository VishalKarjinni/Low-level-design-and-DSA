package behavioral_design_pattern.statePattern;

public class TrafficLightContext {
    private TrafficStateLight currentState;
    public TrafficLightContext() {
       this.currentState = new RedState();
    }
    public void setState(TrafficStateLight state) {
        this.currentState = state;
    }
    public void next() {
        currentState.next(this);
    }
    public String getColor() {
        return currentState.getColor();
    }

}
