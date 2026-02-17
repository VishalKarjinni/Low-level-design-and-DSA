package behavioral_design_pattern.observerdesignpart2;

public class Subscriber implements ISubscriber{
    private String name;
    private Channel channel;

    public Subscriber(String name, Channel channel) {
        this.name = name;
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
     public void update() {
        System.out.println(name + " received notification: " + channel.getLatestVideo());
     }
}
