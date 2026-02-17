package behavioral_design_pattern.observerdesignpart2;

public interface IChannel {
    public void subscribe(ISubscriber subscriber);
    public void unSubscribe(ISubscriber subscriber);
    public void notifySubscribers();
}
