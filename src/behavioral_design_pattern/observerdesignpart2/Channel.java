package behavioral_design_pattern.observerdesignpart2;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel{

    private List<ISubscriber> subscribers;
    private String name;
    private String latestVideo;


     public Channel(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    @Override
    public void unSubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (ISubscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void uploadVideo(String videoTitle) {
        this.latestVideo = videoTitle;
        System.out.println("New video uploaded: " + videoTitle);
        notifySubscribers();
    }

    public String getLatestVideo() {
        return "\n Checkout the our latest video: " + latestVideo;
    }
}
